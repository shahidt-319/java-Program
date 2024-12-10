public class Employee {
String name ;
int id  ;
double salary ;
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
public double grossSalary(){
    double hra = 0.20 * salary;
    double allowance = 0.25 * salary;
    salary = salary + hra + allowance;
    System.out.println("gross Salary  = " +salary);
    return salary;
}
public void bonus(double bonus){
   salary += bonus;
    System.out.println("salary with bonus = " +salary);
}
    public static void main(String[] args) {
        Employee e1 = new Employee("Shahid",19,50000);
        e1.grossSalary();
        e1.bonus(5000);
        Employee e2 = new Employee("faisal",53,60000);
        e2.grossSalary();
        e2.bonus(6000);
    }
    }


