import java.util.*;

public class hw {
    public static void main(String args[])
    {        
        // H.W.
        // 1> Print meaning full variables
        int age = 19;
        String firstname = "Prayag";
        String lastname = "sahu";
        System.out.println(firstname + " " + lastname + " " + age);
        
        // 2> Calculate area of circle
        System.out.print("Input Radius Of A Circle : ");
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        float area = 3.14f * radius * radius;
        System.out.println("Area Of Circle : "+area);

        // 3> Print table of a Number 
        System.out.println("Input Any Number To Generate A Table : ");
        int number = sc.nextInt();
        System.out.print(number*1+" ");
        System.out.print(number*2+" ");
        System.out.print(number*3+" ");
        System.out.print(number*4+" ");
        System.out.print(number*5+" ");
        System.out.print(number*6+" ");
        System.out.print(number*7+" ");
        System.out.print(number*8+" ");
        System.out.print(number*9+" ");
        System.out.print(number * 10 + " ");

        sc.close();
    }
}
