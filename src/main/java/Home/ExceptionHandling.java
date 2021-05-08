package Home;

public class ExceptionHandling {
    public static void main(String[] args) throws InterruptedException {
        //uncaught exception
        int i = 9/0;
        System.out.println(i);
        //caught exception
        Thread.sleep(1000);
    }
}
