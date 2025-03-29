import java.util.*;

public class calcuarea {
    public static void main(String args[])
    {        
        // 2> Calculate area of circle
        System.out.println("Input Radius Of A Circle : ");
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        float area = 3.14f * radius * radius;
        System.out.println("Area Of Circle : "+area);

        sc.close();
    }
}
