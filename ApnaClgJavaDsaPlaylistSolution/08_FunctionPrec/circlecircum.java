import java.util.*;
public class circlecircum {

    // 4> circumfrence of circle
    public static float circum(float radius)
    {
        float circumfrence = 2*3.14F*radius;
        return circumfrence;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


            // 4> circumfrence of circle
            System.out.print("Enter Radius of circle : ");
            float num = sc.nextFloat();
            System.out.println("Circumference of Circle : "+circum(num));

    }
}
