package classLoader;

public class AppClassLoaderTest {

    public static void main(String[] args) {
        ClassLoader classLoader = AppClassLoaderTest.class.getClassLoader();
        ClassLoader parent = AppClassLoaderTest.class.getClassLoader().getParent();
        System.out.println(classLoader);
        System.out.println(parent);
//
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("java.class.path"));

//        ClassLoader classLoader = String.class.getClassLoader();
//        System.out.println(classLoader);

    }
}
