/*
✅ Question 11: Create a Program (Multi-Level Inheritance)
Q: Write a Java program where:

Class Device has method powerOn()

Class Laptop inherits Device and has method boot()

Class GamingLaptop inherits Laptop and has method startGame()

Create an object of GamingLaptop and call all methods.

 */

 class Device {
    void powerOn() {
    System.out.println("Device is powered on");
    }
   }
   class Laptop extends Device {
    void boot() {
    System.out.println("Laptop is booting");
}
}
class GamingLaptop extends Laptop {
 void startGame() {
 System.out.println("Game is starting on Gaming Laptop");
 }
}

public class MultiLevelInher2 {
    public static void main(String[] args) {
        GamingLaptop g = new GamingLaptop();
        g.powerOn();
        g.boot();
        g.startGame();
        }
}
/*
Device is powered on
Laptop is booting
Game is starting on Gaming Laptop
 */