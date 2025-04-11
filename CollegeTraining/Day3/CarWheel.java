public class CarWheel {
    public static class Car{
        String color;
        static int wheel = 4;
        Car(String col)
        {
            color = col;
        }
    }
    public static void main(String[] args) {
        Car c = new Car("Black");
        System.out.println("The color of the car is : "+c.color+" and the number of whees of the car is : "+Car.wheel);
    }
    
}
// o/p (The color of the car is : Black and the number of whees of the car is : 4)