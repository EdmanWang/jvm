package demo02;

/**
 * 1：测试 volatile 的可见性。
 * 2：分析java线程内存模型
 */
public class VolatileVisibleTest {

    // 初始化变量
    private static boolean initFlag = false;

    public static void main(String[] args) throws InterruptedException {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("wait data............");
                while (!initFlag) {
                }
                System.out.println("wait end .............");
            }
        }).start();

        Thread.sleep(2000);

        new Thread(new Runnable() {
            @Override
            public void run() {
                prepareData();
            }
        }).start();
    }

    public static void prepareData() {
        System.out.println("provide data...............");
        initFlag = true;
        System.out.println("provide data end............");
    }
}
