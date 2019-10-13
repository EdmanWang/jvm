package wgxClass;

import java.io.Serializable;

public class ClassD extends Thread implements Serializable, Cloneable {

    public int age;

    private String name;

    protected boolean flag;

    public People people;

    public final String finalString = "wgx";

    public static Integer staticInteget = 24;

    public int getSomething() {
        return 1;
    }

    public void showAnything(String name) {
        System.out.println(name);
    }

    public People initPeople(String peopleName){
        People people = new People();
        return people;
    }

    public int testCode() {
        int initCode;
        try {
            initCode = 1;
            return initCode;
        } catch (Exception e) {
            initCode = 2;
            return initCode;
        } finally {
            initCode = 3;
        }
    }
}
