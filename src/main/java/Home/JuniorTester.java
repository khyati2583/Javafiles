package Home;

public class JuniorTester {
    public static void main(String[] args) {
        try {
            int i = 9 / 0;// this code will throw exception
        }
        catch (ArithmeticException e) {
            System.out.println( "Division not possible");
        }


    }


}
