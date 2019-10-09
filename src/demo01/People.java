package demo01;

public class People {

    public static void main(String[] args) {
        long totalMemory = Runtime.getRuntime().totalMemory();
        long maxMemory = Runtime.getRuntime().maxMemory();

        // 默认的最小堆内存是 本机内存的64分之一
        System.out.println("totalMemery" + totalMemory / 1024 / 1024);
        // 默认的最小堆内存是 本机内存的4分之一
        System.out.println("maxMemory" + maxMemory / 1024 / 1024);
    }
}
