import java.util.*;

public class updatebit {
    public static void main(String[] args) {
        
        int n = 5;//101
        int pos = 2;//1
        int bitmask = 1<<pos; // 001<<2 -> 100


        // updatebit perform two task set and clear bit
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 1 for setbit and 0 for clearbit : ");
        int num = sc.nextInt();
        if(num==1)
        {
            int newnum = bitmask | n; // 100 | 101 = 101 = 5(o/p)
            System.out.println(newnum); 
        }
        else{
            int notbitmask = ~(bitmask); // 011
            int newnum = notbitmask & n; // 011 & 101 = 001 = 1(o/p)
            System.out.println(newnum);
        }

    }
    
}
