package gcTest;

public class GCFail {

    public static GCFail gcFail = null;

    public static void main(String[] args) throws Throwable {
        gcFail = new GCFail();
        if (gcFail != null) {
            System.out.println("i living ");
        }
        gcFail = null;
        System.gc();
        Thread.sleep(500);
        if (gcFail != null) {
            System.out.println("i still living ");
        } else {
            System.out.println("i dead ");
        }

        gcFail = null;
        System.gc();
        Thread.sleep(500);
        if (gcFail != null) {
            System.out.println("i still living ");
        } else {
            System.out.println("i dead ");
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        gcFail =this;
        System.out.println("finalize excuted now !!!!!!");
    }
}
