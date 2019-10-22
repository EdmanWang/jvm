package gcTest.memoryStrategy;

// 根据对象年龄进入老年代
public class Test02 {

    private static final int _1MB = 1024 * 1024;

    /**
     *   VM参数设置
     *  -XX:+UseConcMarkSweepGC  -verbose:gc   -Xms20m  -Xmx20m  -Xmn10m  -XX:SurvivorRatio=8  -XX:+PrintGCDetails
     *  -XX:MaxTenuringThreshold=1
     *  -XX:+PrintTenuringDistribution
     */
    public static void main(String[] args) {
        System.gc();
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[_1MB / 4];
        allocation2 = new byte[4 * _1MB];
        allocation3 = new byte[4 * _1MB];  // 这里发生了一次gc,  allocation1 进入了S0

        allocation3 = null;
        allocation3 = new byte[4 * _1MB];  // 这里也是发生了一次gc,  allocation1 进入了old , allocation2 进入 old
    }
}
