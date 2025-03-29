import java.util.*;
public class avarage {

    // 1> Avarage of 3 numbers
    public static float avg(int a,int b,int c)
    {
        float d;
        d=(a+b+c)/2;
        return d;
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // 1> Avarage of 3 numbers
        System.out.print("Enter 3 Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Avarage : "+avg(a,b,c));



    }
}
