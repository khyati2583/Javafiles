package Oopspackage;

public class Overloading {
    static int  overloading() {

        return (10 + 20 + 30) ;
    }

    public static void main(String[] args) {
        Overloading o = new Overloading();
        System.out.println(overloading());
        System.out.println(o.overloading());
        System.out.println(o.overloading());
    }
}
