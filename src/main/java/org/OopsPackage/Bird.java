package OopsPackage;

public class Bird {
String name;
int age;
String  colour;
}
class Bird2{
    public static void main(String[] args) {
        Bird b1 = new Bird();
        b1.age = 4 ;
        b1.colour="yellow  ";
        b1.name ="All budgies are ";

        System.out.println(b1.name+b1.colour+""+ "and there are " + b1.age + " budgies.");

    }
}