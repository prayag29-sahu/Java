public class EmpliyeeDet {
    public static class Employee
    {
        String name;
        int id;
        float salary;

        public Employee(String Empname, int Empid,float Empsal) {
            name = Empname;
            id = Empid;
            salary = Empsal;
        }
        void display()
        {
            System.out.println("The Employees Details : \n"+"Name = "+name+" Id = "+id+" Salary = "+salary);
        }
        
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("Mukesh", 134, 20000);        
        Employee emp2 = new Employee("Ramesh", 234, 30000);        
        Employee emp3 = new Employee("Jogesh", 334, 40000);        
        emp1.display();
        emp2.display();
        emp3.display();
    }
}
/*
 * o/p 
 * (The Employees Details : 
    Name = Mukesh Id = 134 Salary = 20000.0
    The Employees Details :
    Name = Ramesh Id = 234 Salary = 30000.0
    The Employees Details :
    Name = Jogesh Id = 334 Salary = 40000.0)
 */