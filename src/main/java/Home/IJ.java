package Home;

public class IJ {
    int salary;
    IJ(int salary){
        this.salary=salary;

    }
}
class ML extends IJ {
    int salary;
    IJ(int salaryIJ, int salaryML){
        super(salaryIJ);
        salary = salaryIJ;
    }
}
void display(){
    System.out.println(salary + " " + super.salary);
}

    public static void main(String[] args) {
        ML obj = new ML(5000,10000);
        obj.display();
    }