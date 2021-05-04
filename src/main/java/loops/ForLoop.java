package loops;


public class ForLoop {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }


        System.out.println("While Loop");

        int x = 9;
        int i = 1;
        while  (i<=10) {
            System.out.println(x + " * " + i + " = " + x * i);
            i++;
        }

        System.out.println(" do while loop");

        int y = 8;
        int z= 1;
        do {
            System.out.println(y + " * " + z + " = " + y * z);
            z++;
        }
        while (z<=10);
    }
}











