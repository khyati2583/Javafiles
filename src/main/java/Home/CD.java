package Home;

public class CD {
    public static void main(String[] args) {
        try{
            int [] myNumbers = {10,20,30};
            System.out.println((myNumbers[1]));//100
        }catch (Exception e) {
            System.out.println("Something wrong");
        } finally {
            System.out.println("try catch is finished");
        }
    }
}