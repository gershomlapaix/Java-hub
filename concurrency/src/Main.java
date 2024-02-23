public class Main {
    public static void main(String[] args) {

        /* using threads */
        Threading1 thread = new Threading1();
        thread.start();

        /* using runnable interface */
        Threading2 runnable = new Threading2();
        Thread aThread = new Thread(runnable);
        aThread.start();
    }
}