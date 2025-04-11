public class PrintCarColor {
    public static class Car{
        String color;
        Car(String col)
        {
            color = col;
        }
    }
    public static void main(String[] args) {
        Car c = new Car("Black");
        System.out.println("The color of the car is : "+c.color);
    }
}
// o/p (The color of the car is : Black)