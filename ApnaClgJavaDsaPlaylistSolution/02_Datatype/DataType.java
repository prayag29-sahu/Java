import java.util.*;

public class DataType {
    public static void main(String args[])
    {
        // variables
        int a = 19;
        String name = "Prayag";
        System.out.println(name + " " + a);
        
        // premitive data type
        int num=100000;
        byte num1=100;
        float num2=100.0F;
        long num3=10000000L;
        double num4=100000000;
        char ch = 'H';
        String name2 = "Ram";
        boolean numis=true;
        int[] array = {1,2,3,4,5};
        System.out.println(num + " " + num1 + " " + num2 + " " + num3 + " " + num4 + " " + ch + " " + name2 + " "+ array[0] + " " + array[1] + " "+numis);      

        // constant
        final float pi = 3.14F;
        System.out.println(pi);
        
        // H.W.
        // 1> Print meaning full variables
        int age = 19;
        String firstname = "Prayag";
        String lastname = "sahu";
        System.out.println(firstname + " " + lastname + " " + age);
        
        // 2> Calculate area of circle
        System.out.println("Input Radius Of A Circle : ");
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
