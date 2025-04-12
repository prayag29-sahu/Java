/*
 * Create a class named Employee with instance variables name, id, and salary. Inside the main
method declare the variable as percentage and increases the salary by that percentage.
 */

public class EmployeePercent {
    public static class Employee {
        String name = "Ram";
        int id = 12345;
        double salary = 35000.0;
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        int percentage = 10;
        System.out.println("Employee Details Name : "+emp1.name+" id = "+emp1.id+" And salary : "+(emp1.salary+((emp1.salary*percentage)/100)));
    }
}
// o/p (Employee Details Name : Ram id = 12345 And salary : 38500.0)
