/*
8. Create a class Employee with name, id, and salary. Write a method to give a 5% salary
increment. Print details before and after increment
 */
class EmployeDetails
{
    String name;
    int id;
    double salary;

    EmployeDetails(String n, int i,double s) {
        name = n;
        id = i;
        salary = s;
    }
    void display(){
        System.out.println("Employee Name : "+name);
        System.out.println("Employee ID : "+id);
        salary = salary + (salary*5)/100;
        System.out.println("Employee Salary after 5% increment: "+salary);
    }
    
}
public class Employee {
    public static void main(String[] args) {
        EmployeDetails e1 = new EmployeDetails("Rohan", 243523, 30000);
        e1.display();
    }
}
/*
Employee Name : Rohan
Employee ID : 243523
Employee Salary after 5% increment: 31500.0
 */