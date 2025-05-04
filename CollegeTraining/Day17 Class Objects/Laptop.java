/*
11. Create a class Laptop with brand, RAM, and price. Add a constructor to initialize values and a
method to display them.
 */

class LaptopDetails{
    String brand;
    int RAM;
    double price;

    LaptopDetails(String b, int ram,double p) {
        brand = b;
        RAM = ram;
        price = p;
    }
    void display(){
        System.out.println("Laptop Brand : "+brand);
        System.out.println("Laptop RAM : "+RAM);
        System.out.println("Laptop Price : "+price);
    }
    
}
public class Laptop {
    public static void main(String[] args) {
        LaptopDetails l = new LaptopDetails("Lenovo", 16, 65000);
        l.display();
    }
}
/*
Laptop Brand : Lenovo
Laptop RAM : 16
Laptop Price : 65000.0
 */