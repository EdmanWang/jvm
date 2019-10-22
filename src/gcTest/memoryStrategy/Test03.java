package gcTest.memoryStrategy;

// 动态年龄判断
public class Test03 {
    private static final int _1MB = 1024 * 1024;

    /**
     *   VM参数设置
     *  -XX:+UseConcMarkSweepGC  -verbose:gc   -Xms20m  -Xmx20m  -Xmn10m  -XX:SurvivorRatio=8  -XX:+PrintGCDetails
     *  -XX:+PrintTenuringDistribution
     */
    public static void main(String[] args) {
        System.gc();
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[_1MB / 4];
        allocation2 = new byte[_1MB / 4];
        allocation3 = new byte[4 * _1MB];

        allocation4 = new byte[4 * _1MB];  // 这里发生了一次gc,   allocation1 ，allocation2 进入 survivor 区

        allocation4 = null;
        allocation4 = new byte[4 * _1MB];  // 这里也是发生了一次gc,  allocation1 ，allocation2 进入 old 区  allocation3 进入 old 区  allocation4 进入 Eden
    }
}

