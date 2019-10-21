package gcTest.memoryStrategy;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

// 对象优先在Eden上进行分配
public class Test01 {

//    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {

        List<GarbageCollectorMXBean> l = ManagementFactory.getGarbageCollectorMXBeans();
        for(GarbageCollectorMXBean b : l) {
            System.out.println(b.getName());
        }
        testAllocation();
//        System.gc();
    }

    public static void testAllocation(){
        byte[] allocation1, allocation2, allocation3, allocation4;

        allocation1 = new byte[2 * 1024 * 1024];

        allocation2 = new byte[2 * 1024 * 1024];

        allocation3 = new byte[2 * 1024 * 1024];

        allocation4 = new byte[4 * 1024 * 1024];
    }
}
