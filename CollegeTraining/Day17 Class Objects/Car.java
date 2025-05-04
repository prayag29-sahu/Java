// 5. Create a class Car with fields brand, model, and price. Write a method to display car details.
// Create multiple objects and display info.

class CarDetails{
    String brand;
    String model;
    double price;
    CarDetails(String b,String m, double p) {
        brand = b;
        model= m;
        price = p;
    }
    void display(){
        System.out.println("Brand : "+brand);
        System.out.println("Model : "+model);
        System.out.println("Price : "+price);
    }
    
}

public class Car {
    public static void main(String[] args) {
        CarDetails c1 = new CarDetails("Toyota", "Corolla", 1000000);
        CarDetails c2 = new CarDetails("Hyundai", "Creta", 1500000);
        CarDetails c3 = new CarDetails("BMW", "3 Series", 6500000);
        c1.display();
        System.out.println();
        c2.display();
        System.out.println();
        c3.display();
        System.out.println();
    }
}
/*
Brand : Toyota
Model : Corolla
Price : 1000000.0

Brand : Hyundai
Model : Creta
Price : 1500000.0

Brand : BMW
Model : 3 Series
Price : 6500000.0

 */