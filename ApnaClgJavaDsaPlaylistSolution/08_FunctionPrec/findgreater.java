import java.util.*;
public class findgreater {

    // 3> find greater from 2 number
    public static int greater(int a,int b)
    {
        if(a>b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        // 3> find greater from 2 number
        System.out.print("Enter 2 Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Greatest Number is : "+greater(a, b));


    }
}
