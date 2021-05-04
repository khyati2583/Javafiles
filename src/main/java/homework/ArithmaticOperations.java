package homework;

public class ArithmaticOperations {

    public static void main(String[] args) {
        int x = 25;
        int y = 20;
        int z= 2;
        boolean c = true;
        System.out.println(x + y + z);
        System.out.println(x-y-z);
        System.out.println(x*y*z);
        System.out.println(x/y/z);
        System.out.println(x%y%z);
        System.out.println(x++ + ++y + ++z);
        System.out.println(x-- + --y + --z);
        System.out.println(x-- + y-- + z--);
        System.out.println(++x * ++y * ++z);
        System.out.println(x++ * y++ * z++);
        System.out.println(x-- + y++ + z--);
        System.out.println(x++);
        System.out.println(!c);
        System.out.println(x*y + y*z + y/z);
        System.out.println(x>>y>>z);

    }
}
