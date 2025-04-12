/*
 * Create a class named Temperature inside the main method that declares a local variable celsius
and prints the converted temperature.
 */

public class TemperatureConvert {
    public static void main(String[] args) {
        class Temperature{
            double celsius = 27;
            double fahren = (celsius*9/5)+32;
        }
        Temperature temp = new Temperature();
        System.out.println("the converted temperature = "+temp.fahren +"°F");
    }
    
}
// o/p (the converted temperature = 80.6°F)