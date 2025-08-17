// Base class

class Vehicle {

    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void start() {
        System.out.println(brand + " vehicle is starting...");
    }

    public void stop() {
        System.out.println(brand + " vehicle is stopping...");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

// Class used via composition
class Engine {

    private String type;
    private int horsepower;

    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    public void showDetails() {
        System.out.println("Engine Type: " + type);
        System.out.println("Horsepower: " + horsepower + " HP");
    }

    public void startEngine() {
        System.out.println("Engine is roaring to life!");
    }
}

// Subclass of Vehicle
class Car extends Vehicle {

    private String model;
    private Engine engine;  // Composition

    public Car(String brand, int year, String model, Engine engine) {
        super(brand, year);
        this.model = model;
        this.engine = engine;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Model: " + model);
        engine.showDetails();
    }

    public void openTrunk() {
        System.out.println("Opening trunk...");
    }

    public void start() {
        super.start();     // Vehicle start
        engine.startEngine(); // Engine start
    }
}

// Subclass of Car (multilevel inheritance)
class ElectricCar extends Car {

    private int batteryCapacity; // in kWh

    public ElectricCar(String brand, int year, String model, Engine engine, int batteryCapacity) {
        super(brand, year, model, engine);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }

    public void chargeBattery() {
        System.out.println("Charging battery to 100%...");
    }
}

// Another subclass of Car
class SportsCar extends Car {

    private int topSpeed; // in km/h

    public SportsCar(String brand, int year, String model, Engine engine, int topSpeed) {
        super(brand, year, model, engine);
        this.topSpeed = topSpeed;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Top Speed: " + topSpeed + " km/h");
    }

    public void launchControl() {
        System.out.println("Activating launch control... Hold tight!");
    }
}

// Main class to test
public class CarStructure {

    public static void main(String[] args) {
        Engine petrolEngine = new Engine("Petrol", 150);
        Engine electricMotor = new Engine("Electric", 200);

        Car normalCar = new Car("Toyota", 2021, "Camry", petrolEngine);
        ElectricCar tesla = new ElectricCar("Tesla", 2023, "Model S", electricMotor, 100);
        SportsCar ferrari = new SportsCar("Ferrari", 2022, "488 Spider", petrolEngine, 340);

        System.out.println("--- Normal Car ---");
        normalCar.start();
        normalCar.displayInfo();
        normalCar.openTrunk();

        System.out.println("\n--- Electric Car ---");
        tesla.start();
        tesla.displayInfo();
        tesla.chargeBattery();

        System.out.println("\n--- Sports Car ---");
        ferrari.start();
        ferrari.displayInfo();
        ferrari.launchControl();
    }
}
