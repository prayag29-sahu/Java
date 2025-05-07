/*
Design a program with a base class Employee having a method calculateSalary and a subclass Manager overriding this method.

The calculateSalary in the Manager class should add a bonus to the basic salary, and the base class should print the salary without the bonus.

 */
class Employee {
    void calculateSalary(int bs){
        System.out.println("Salary without bonus : "+bs);
    }
}
class Manager extends  Employee {
    void calculateSalary(int bs){
        super.calculateSalary(bs);
        System.out.println("Salary with bonus : "+ (bs+1500));        
    }
}
public class EmployeeOverride {
    public static void main(String[] args) {
        Employee e = new Manager();
        e.calculateSalary(20000);
    }
}
/*
Salary without bonus : 20000
Salary with bonus : 21500
 */