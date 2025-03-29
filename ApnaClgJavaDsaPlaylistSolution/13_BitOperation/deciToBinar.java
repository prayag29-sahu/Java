import java.util.*;

public class deciToBinar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // decimal to binary conversion 
        // System.out.print("Enter any number : ");
        // int n = sc.nextInt();
        // int rem;
        // int[] res = new int[5];
        // int i=1;
        // while(n>0)
        // {
        //     rem = n % 2;
        //     res[i]=rem;
        //     i++;
        //     n = n/2;
        // }
        // for(i=4;i>0;i--)
        // {
        //     System.out.print(res[i]+" ");
        // }

        // decimal to binary conversion 
        int binary = 0;
        int remainder;
        int base=1;
        System.out.println("Enter an Decimal number : ");
        int decimal = sc.nextInt();
        while(decimal!=0){
            remainder = decimal % 2;
            binary = binary + remainder * base;
            decimal = decimal / 2;
            base = base * 10;
        }
        System.out.println("Decimal to Binary : "+ binary);

    }
    
}
