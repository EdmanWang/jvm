package demo03;

public class OomTest {

    static int count = 0;

    public static void display(){
        count++;
        System.out.println("------------"+count);
        display();
    }

    public static void main(String[] args) {
        display();
    }
}
