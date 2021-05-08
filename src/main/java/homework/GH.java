package homework;

public class GH {
    int salary = 200;
    void display(){
        System.out.println("class for GH");
    }
}
class SeniorTester extends GH{
    int salary =4000;
    void displayssalaries(){
        System.out.println("GH Salary:"+super.salary);
        System.out.println("Senior Tester Salary:"+salary);
    }

    public static void main(String[] args) {
        SeniorTester obj =new SeniorTester();
        obj.displayssalaries();



    }
}
