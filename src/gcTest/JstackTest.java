package gcTest;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * 问题：为什么使用线程池的时候，主线程不会结束。。。。。。。
 */
public class JstackTest {

    public static Executor executor = Executors.newFixedThreadPool(2);

    private final static Object lock = new Object();

    public static void main(String[] args) {
        executor.execute(new Task());
        executor.execute(new Task());



//        Thread t1 = new Thread(new Task(),"task===1");
//        Thread t2 = new Thread(new Task(),"task===1");
//
//        t1.start();  praking
//        t2.start();
    }

    static class Task implements Runnable {
        @Override
        public void run() {
            int count = 0;
            synchronized (lock) {
//                while (true) {
                    count++;
                    System.out.println("count --->" + count + "当前线程是" + Thread.currentThread().getName());
//                }
            }
        }
    }
}
