
import java.util.Scanner;

public class Areacalcu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double A=l*b;
        System.out.println("Area : " + A + " cm²");
        sc.close();
    }   
}
/*
5
3
Area : 15.0 cm²
 */