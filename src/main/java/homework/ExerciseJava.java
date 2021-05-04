package homework;

public class ExerciseJava {
    public static void main(String[] args) {
        String x = "Rainy";
        String y = "Weather";
        String z = "good weather";
        // concat();

        System.out.println(x+y+z);
        System.out.println(x +y);

        int a = 10;
        int b = 20;
        int c;
        boolean s = true;
        System.out.println(a%b);

        System.out.println(c=a);
        System.out.println(b+=a);
        System.out.println(b-=a);
        System.out.println(b*=a);
        System.out.println(b/=a);
        System.out.println(b%=a);
        System.out.println(b^=a);
        System.out.println(c^=a);

        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);

        System.out.println(a<10 && a<20);
        System.out.println(a<10||a<20);
        System.out.println(!(a<10 & a<20));

        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);
        System.out.println(!s);

        if (20>18) {
            System.out.println("20 is greater than 18");

            int d = 20;
            int f = 18;
            if (d>f) {
                System.out.println( "d is greater than f");

                int time = 22;
                if (time < 10) {
                    System.out.println("Good morning");
                } else if (time < 20) {
                    System.out.println("Good day");
                }else {
                    System.out.println("Good evening");

                    int t = 20;
                    if(t < 18) {
                        System.out.println("Good Day");
                    }else {
                        System.out.println("good evening");
                    }
                }
            }

        }





    }

}
