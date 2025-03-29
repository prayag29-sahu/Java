import java.util.*;

public class bit {
    public static void main(String[] args) {
        
        // int n = 5;//101
        // int pos = 2;//1
        // int bitmask = 1<<pos; // 001<<2 -> 100

        // get bit
        // if((bitmask & n)==0) // 100 & 101 = 100 means 1(o/p) else 000 means 0
        // {
        //     System.out.println("In This Position 0 Present");
        // } else{
        //     System.out.println("In This Position 1 Present");
        // }

        // setbit
        // int newnum = bitmask | n; // 100 | 101 = 101 = 5(o/p)
        // System.out.println(newnum); 

        // clearbit
        // int notbitmask = ~(bitmask); // 011
        // int newnum = notbitmask & n; // 011 & 101 = 001 = 1(o/p)
        // System.out.println(newnum);

        // updatebit perform two task set and clear bit
        Scanner sc = new Scanner(System.in);
        // System.out.print("Input 1 for setbit and 0 for clearbit : ");
        // int num = sc.nextInt();
        // if(num==1)
        // {
        //     int newnum = bitmask | n; // 100 | 101 = 101 = 5(o/p)
        //     System.out.println(newnum); 
        // }
        // else{
        //     int notbitmask = ~(bitmask); // 011
        //     int newnum = notbitmask & n; // 011 & 101 = 001 = 1(o/p)
        //     System.out.println(newnum);
        // }

        // H.W.
        // inputted number is in the power of 2, 2^1 = 2 = 10, 2^2 = 4 = 100, 2^3 = 8 = 1000,  2^4 = 16 = 10000
        // System.out.println("Enter any number : ");
        // int n = sc.nextInt();
        // if(n>0 && (n & (n-1))==0)
        // {
        //     System.out.println("Inputted number is in the power of 2");
        // }
        // else{
        //     System.out.println("Inputted number is not in the power of 2");
        // }

        // toggale number using set the position element different 29-11101 set positon in 3, 1 to 0 =  10101 = 21
        // System.out.print("Enter any number : ");
        // int n = sc.nextInt();
        // System.out.print("Enter any position : ");
        // int pos = sc.nextInt();
        // int bitmask = 1<<pos;
        // int newnum  = n ^ (bitmask);
        // System.out.println("Toggle number : "+newnum);

        // how much 1's in the number 
        // System.out.print("Enter any number : ");
        // int n = sc.nextInt();
        // int count = 0;
        // while(n>0)
        // {
        //     if((n & 1)==1)
        //     {
        //         count++;
        //     }
        //     n >>= 1;
        // }
        // System.out.println("Number of 1's are : "+count);

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
        // // decimal to binary conversion 
        // int binary = 0;
        // int remainder;
        // int base=1;
        // System.out.println("Enter an Decimal number : ");
        // int decimal = sc.nextInt();
        // while(decimal!=0){
        //     remainder = decimal % 2;
        //     binary = binary + remainder * base;
        //     decimal = decimal / 2;
        //     base = base * 10;
        // }
        // System.out.println("Decimal to Binary : "+ binary);





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
        // int remainder;
        // int decimal = 0;
        // int base=1;
        // System.out.println("Enter an binary number : ");
        // int binary = sc.nextInt();
        // while(binary!=0){
        //     remainder = binary % 10;
        //     decimal = decimal + remainder * base;
        //     binary = binary / 10;
        //     base = base * 2;
        // }
        // System.out.println("Binary to decimal : "+ decimal);






        
    }
    
}
