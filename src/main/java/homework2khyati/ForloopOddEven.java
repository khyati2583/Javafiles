package homework2khyati;

public class ForloopOddEven {

    public static void main(String[] args) {
        int l [] = new int [] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22};
        System.out.println("odd numbers");

        for(int x=0; x<l.length; x= x+2){
            System.out.println(l[x]);
        }
        System.out.println("even numbers");
        for(int x=1; x<l.length;x=x+2){
            System.out.println(l[x]);
        }
    }

    }

