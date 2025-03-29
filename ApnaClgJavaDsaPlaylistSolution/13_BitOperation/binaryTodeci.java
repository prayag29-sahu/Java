import java.util.*;

public class binaryTodeci {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // binary to decimal 
        // System.out.print("Enter any number : ");
        // int n = sc.nextInt();
        // int res = 0; 
        // int i = 1; 
        // while(n>0) // 11101 / 1110 / 111 /11/1
        // {
        //     int rem = n%2; // 1/0/1/ 1/ 1
        //     n=n/10; // 1110 / 111/11 / 1/0
        //     for(int j=1;j<=i;j++)
        //     {
        //         res = res + 2*rem; // 2/ 2/2/ 4/6/8/ 10/12/14/16 /18/20/22/24/26
        //         System.out.print(res+" ");
        //     }
        //     i++; // 2 / 3 / 4 / 5
            
        // }
        // System.out.println();
        // System.out.println(res);
        // System.out.println(11101%2);
        // 11101 = 2^0*1+2^1*0+2^2*1+2^3*1+2^4*1
        
        // binary to decimal 
        int remainder;
        int decimal = 0;
        int base=1;
        System.out.println("Enter an binary number : ");
        int binary = sc.nextInt();
        while(binary!=0){
            remainder = binary % 10;
            decimal = decimal + remainder * base;
            binary = binary / 10;
            base = base * 2;
        }
        System.out.println("Binary to decimal : "+ decimal);






        
    }
    
}
