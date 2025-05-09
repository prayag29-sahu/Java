class Employee {
    private int id;
    private double salary;
    private String name;
    public void setD(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public int getI(){
        return id;
    }
    public double getS(){
        return salary;
    }
    public String getN(){
        return name;
    }
    public void print(){
        System.out.println("Employee Name : "+getN());
        System.out.println("Employee id : "+getI());
        System.out.println("Employee Salary : "+getS());
    }

}
public class EmployeeEncap {
    public static void main(String[] args) {
        Employee E = new Employee();
        E.setD("Roy", 12345, 20000.0);
        E.print();
    }
    
}
/*
Employee Name : Roy
Employee id : 12345
Employee Salary : 20000.0
 */