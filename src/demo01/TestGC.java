package demo01;

import java.util.ArrayList;
import java.util.List;

public class TestGC {

    static Integer[] a = new Integer[1 * 1024 * 1024];

    public static void main(String[] args) throws InterruptedException {
        List<Integer[]> list = new ArrayList<>();
        while (true){
            list.add(a);
            Thread.sleep(50);
        }
    }
}
