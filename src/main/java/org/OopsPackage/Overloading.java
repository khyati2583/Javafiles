package OopsPackage;

public class Overloading {
    static int overloading(int x, int y) {
        return (x+y);
    }
    static int  overloading(int x, int y,int z) {
        return (x+y+z) ;
    }
    static double overloading(double x,double y,double z) {
        return (x+y+z);
    }

    public static void main(String[] args) {
        Overloading o = new Overloading();
        System.out.println(o.overloading(10,20));
        System.out.println(o.overloading(10,20,30));
        System.out.println(o.overloading(10.5,20.5,30.5));
    }
}
