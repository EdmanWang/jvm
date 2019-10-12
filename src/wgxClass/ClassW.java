package wgxClass;

import java.io.Serializable;

/**
 * 复杂一些的的类文件分析
 */
public class ClassW extends Thread implements Serializable, Comparable{

    static int id = 1;

    public void display(){

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
