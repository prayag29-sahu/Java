import java.util.*;

public class Multiplication {

    public static float multi(float p, float q)
    {
        float num1=p;
        float num2=q;
        float Multiplication = num1*num2;
        return Multiplication;
    }
    
    public static void main(String[] args) {


        System.out.print("Enter Two Values : ");
        Scanner sc = new Scanner(System.in);
        float d = sc.nextFloat();
        float e = sc.nextFloat();
        System.out.println("Multiplication : "+multi(d,e));

    }
}
