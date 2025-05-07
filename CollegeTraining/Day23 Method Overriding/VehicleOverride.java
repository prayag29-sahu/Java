/*Write a program where a base class Vehicle has a startEngine method.

The subclass Car should override this method to display "Car engine started". Create an instance of Car and call the startEngine method.
 */
class Vehicle {
    void startEngine(){
    }
}
class Car extends Vehicle {
    void startEngine(){
        System.out.println("Car engine started");
    }
}
class VehicleOverride {
    public static void main(String[] args) {
    Vehicle v = new Car();
    v.startEngine();
    }
}
/*

Car engine started
 */