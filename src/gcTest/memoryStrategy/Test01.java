package gcTest.memoryStrategy;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

// 大对象直接进入老年代
public class Test01 {

    private static final int _1MB = 1024 * 1024;

    /**
     *   VM参数设置
     *  -XX:+UseConcMarkSweepGC  -verbose:gc   -Xms20m  -Xmx20m  -Xmn10m  -XX:SurvivorRatio=8  -XX:+PrintGCDetails
     *  -XX:PretenureSizeThreshold=1023
     */
    public static void main(String[] args) {
        System.gc();
        testAllocation();
    }

    public static void testAllocation(){
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation4 = new byte[4 * _1MB];
    }
}
