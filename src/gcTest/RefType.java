package gcTest;

import wgxClass.People;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class RefType {

    public static void main(String[] args) throws InterruptedException {
        People people = new People();
        //将缓存数据用软引用持有
        SoftReference<byte[]> peopleRef = new SoftReference(people);
        //进行一次GC后查看对象的回收情况
        System.gc();
        //等待GC
        Thread.sleep(500);
        System.out.println("第一次GC后" + people);
        System.out.println("第一次GC后" + peopleRef.get());

        people = null;
        System.gc();
        //等待GC
        Thread.sleep(500);
        System.out.println("第二次GC后" + people);
        System.out.println("第二次GC后" + peopleRef.get());
    }
}
