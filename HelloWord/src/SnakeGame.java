import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Swing版贪吃蛇小游戏
 * 操作说明：方向键 ↑↓←→ 控制蛇移动方向，空格键 Game Over后重新开始
 * 游戏规则：撞墙/撞自己=Game Over，吃红色食物=蛇变长+得分
 */
// ========== 第一步：定义游戏主窗口（继承JFrame就是一个可显示的窗口）==========
public class SnakeGame extends JFrame {
    // 【核心变量区】先把游戏需要的所有东西定义好，后面方法里直接用
    private static final int CELL_SIZE = 20; // 每个格子的大小（像素），蛇/食物都是一个格子
    private static final int GAME_WIDTH = 400; // 游戏窗口宽度（400/20=20列）
    private static final int GAME_HEIGHT = 400; // 游戏窗口高度（400/20=20行）
    private static final int GAME_SPEED = 120; // 蛇移动速度（毫秒）：数字越小移动越快

    // 蛇的身体！用ArrayList存「坐标点」，每个Point是(x,y)
    // index 0 = 蛇头（最前面），后面的是身体，最后一个是尾巴
    private ArrayList<Point> snakeBody;
    private Point food; // 食物的坐标（也是一个Point）
    private String currentDir; // 当前移动方向：↑↓←→ 分别对应 "UP"/"DOWN"/"LEFT"/"RIGHT"
    private boolean isGameOver; // 游戏是否结束：true=不能移动，按空格重新来
    private Timer gameTimer; // 定时刷新蛇移动的「时钟」（Swing自带的，超好用）

    // ========== 第二步：构造方法（窗口初始化，启动时自动执行）==========
    public SnakeGame() {
        // 1. 配置窗口基本属性
        setTitle("🐍 新手贪吃蛇"); // 窗口标题
        setSize(GAME_WIDTH + 15, GAME_HEIGHT + 35); // 窗口大小（加一点余量，防止边框把内容挡住）
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 点X关闭窗口=结束程序（硬性要求！）
        setLocationRelativeTo(null); // 窗口居中显示（null=屏幕中心）
        setResizable(false); // 禁止拖拽改变窗口大小（格子固定，改了会乱）

        // 2. 初始化游戏核心逻辑
        initGame(); // 调用下面的初始化方法，把蛇、食物、方向都准备好

        // 3. 用画板（GamePanel）来画蛇、食物、游戏状态
        // JPanel是Swing里专门用来「自定义画图」的组件，后面会写GamePanel类
        add(new GamePanel());

        // 4. 键盘监听（用匿名内部类实现KeyListener，专门按方向键/空格）
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                handleKeyPress(e); // 调用下面的键盘处理方法
            }
        });
        setFocusable(true); // 让窗口能「收到键盘信号」（没这句按方向键没反应！）

        // 5. 启动定时刷新的时钟：每隔GAME_SPEED毫秒，自动让蛇移动一次
        gameTimer = new Timer(GAME_SPEED, e -> moveSnake()); // 用了你还没学的Lambda，等价于写ActionListener匿名类
        gameTimer.start(); // 时钟转起来了！蛇开始自己动
    }

    // ========== 第三步：游戏初始化（开始/重新开始时都要跑一遍）==========
    private void initGame() {
        snakeBody = new ArrayList<>();
        // 初始蛇：3个身体节点，在窗口中间横着放
        int startX = GAME_WIDTH / CELL_SIZE / 2; // 初始蛇头的x坐标（20列的中间=10）
        int startY = GAME_HEIGHT / CELL_SIZE / 2; // 初始蛇头的y坐标（20行的中间=10）
        snakeBody.add(new Point(startX, startY)); // 蛇头
        snakeBody.add(new Point(startX - 1, startY)); // 蛇身（蛇头左边一格）
        snakeBody.add(new Point(startX - 2, startY)); // 蛇尾（再左边一格）

        currentDir = "RIGHT"; // 初始方向：向右走
        isGameOver = false; // 游戏没结束
        generateFood(); // 生成第一个食物
    }

    // ========== 第四步：生成随机食物（不能生成在蛇身上！）==========
    private void generateFood() {
        Random random = new Random();
        // 循环找一个「不在蛇身上」的位置当食物，找到了就停
        while (true) {
            int foodX = random.nextInt(GAME_WIDTH / CELL_SIZE); // 随机0-19（20列的范围）
            int foodY = random.nextInt(GAME_HEIGHT / CELL_SIZE); // 随机0-19（20行的范围）
            Point candidate = new Point(foodX, foodY);
            // 如果这个位置和蛇的任何一个身体节点都不重合，就用它
            if (!snakeBody.contains(candidate)) {
                food = candidate;
                return; // 找到食物了，跳出循环
            }
        }
    }

    // ========== 第五步：核心！蛇移动逻辑（时钟每隔GAME_SPEED毫秒自动调用）==========
    private void moveSnake() {
        if (isGameOver) return; // 游戏结束了就别移动了

        // 1. 根据当前方向，计算新的蛇头坐标
        Point head = snakeBody.get(0); // 原来的蛇头
        Point newHead = (Point) head.clone(); // 复制一个新的（不能直接改原来的）
        switch (currentDir) {
            case "UP":    newHead.y -= 1; break; // 向上走：y坐标减1（Swing的y轴是向下为正！）
            case "DOWN":  newHead.y += 1; break; // 向下走：y坐标加1
            case "LEFT":  newHead.x -= 1; break; // 向左走：x坐标减1
            case "RIGHT": newHead.x += 1; break; // 向右走：x坐标加1
        }

        // 2. 碰撞检测（撞墙？撞自己？）——撞了就Game Over
        if (checkCollision(newHead)) {
            isGameOver = true;
            gameTimer.stop(); // 时钟停了，蛇不动了
            return;
        }

        // 3. 把新蛇头加到身体最前面
        snakeBody.add(0, newHead);

        // 4. 判断有没有吃到食物
        if (newHead.equals(food)) {
            // 吃到了！不用删尾巴（蛇就变长了！），再生成新食物
            generateFood();
        } else {
            // 没吃到！删掉最后一个尾巴节点（蛇长度保持不变）
            snakeBody.remove(snakeBody.size() - 1);
        }

        // 5. 让画板重新画一次（不然蛇的新位置看不见）
        repaint();
    }

    // ========== 第六步：碰撞检测（撞墙/撞自己？）==========
    private boolean checkCollision(Point head) {
        // 撞墙：x<0（左墙）/x>=20（右墙）/y<0（上墙）/y>=20（下墙）
        if (head.x < 0 || head.x >= GAME_WIDTH / CELL_SIZE
                || head.y < 0 || head.y >= GAME_HEIGHT / CELL_SIZE) {
            return true;
        }
        // 撞自己：新蛇头和身体任何一个节点重合（从index 1开始，index 0是自己）
        for (int i = 1; i < snakeBody.size(); i++) {
            if (head.equals(snakeBody.get(i))) {
                return true;
            }
        }
        return false;
    }

    // ========== 第七步：键盘处理（方向键改方向，空格重新开始）==========
    private void handleKeyPress(KeyEvent e) {
        // 重新开始游戏（Game Over时按空格）
        if (isGameOver && e.getKeyCode() == KeyEvent.VK_SPACE) {
            initGame(); // 重新初始化
            gameTimer.start(); // 时钟再转起来
            repaint();
            return;
        }
        // 方向键控制（加了「不能直接反向」的判断：向右走时，不能直接按左）
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:    if (!"DOWN".equals(currentDir))  currentDir = "UP"; break;
            case KeyEvent.VK_DOWN:  if (!"UP".equals(currentDir))    currentDir = "DOWN"; break;
            case KeyEvent.VK_LEFT:  if (!"RIGHT".equals(currentDir)) currentDir = "LEFT"; break;
            case KeyEvent.VK_RIGHT: if (!"LEFT".equals(currentDir))  currentDir = "RIGHT"; break;
        }
    }

    // ========== 第八步：画板类（专门负责画东西，继承JPanel）==========
    class GamePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g); // 先清屏（必须加！不然会有残影）
            g.setColor(Color.BLACK); // 画板背景设成黑色（经典贪吃蛇配色）
            g.fillRect(0, 0, GAME_WIDTH, GAME_HEIGHT);

            // 1. 画食物（红色小方块）
            g.setColor(Color.RED);
            g.fillOval(food.x * CELL_SIZE + 2, food.y * CELL_SIZE + 2,
                    CELL_SIZE - 4, CELL_SIZE - 4); // 用圆形画食物，比方块好看，+2/-4是让它居中

            // 2. 画蛇（绿色方块，蛇头颜色深一点，身体浅一点）
            for (int i = 0; i < snakeBody.size(); i++) {
                Point p = snakeBody.get(i);
                if (i == 0) {
                    g.setColor(Color.GREEN.darker()); // 蛇头：深绿色
                } else {
                    g.setColor(Color.GREEN); // 身体：浅绿色
                }
                // 画方块：x*格子大小，y*格子大小，宽高都是格子大小
                g.fillRect(p.x * CELL_SIZE, p.y * CELL_SIZE, CELL_SIZE, CELL_SIZE);
            }

            // 3. Game Over时显示提示文字
            if (isGameOver) {
                g.setColor(Color.WHITE);
                g.setFont(new Font("微软雅黑", Font.BOLD, 30)); // 大字号加粗
                g.drawString("游戏结束！", GAME_WIDTH/2 - 70, GAME_HEIGHT/2 - 10); // 居中画
                g.setFont(new Font("微软雅黑", Font.PLAIN, 16));
                g.drawString("按空格键重新开始", GAME_WIDTH/2 - 70, GAME_HEIGHT/2 + 30);
            }
        }
    }

    // ========== 第九步：主方法（psvm生成的标准签名！）==========
    public static void main(String[] args) {
        // Swing规范：所有GUI组件的创建必须在「事件分发线程」里，否则可能卡顿/乱序
        SwingUtilities.invokeLater(() -> {
            new SnakeGame().setVisible(true); // 创建游戏窗口，显示出来
        });
    }
}