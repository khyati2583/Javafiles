package homework2khyati;

public class OddEven {
    public static void main(String[] args) {

        int x[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22};
        System.out.println("even numbers");

        for (int i = 0; i < x.length; i++) {

            if (x[i] % 2 == 0) {

                System.out.println(x[i]);
            }
        }
        System.out.println("odd numbers");
                for(int i=0; i < x.length;i++) {
                    if (x[i] % 2 != 0) {

                        System.out.println(x[i]);
                    }
                }


                    }
                }




