package gcTest;

import wgxClass.People;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 确认那些对象是垃圾对象
public class MakeSureGC {

    static People people01;

    final People people02 = new People();

    public native void show(People people);

    public void display(){People people = new People();}

    public void reachableTest() {
        // people 作为一个 GC roots
        People people;
        people = new People();

        // peopleList 作为一个 GC roots
        List<People> list = new ArrayList<>();
        list.add(people);

        list.remove(people);

        // map 作为一个 GC roots
        Map<String, List<People>> map = new HashMap<>();
        map.put("list", list);

        map.remove("list");

        people = null;
        System.gc();
    }

    public static void main(String[] args) {

    }
}
