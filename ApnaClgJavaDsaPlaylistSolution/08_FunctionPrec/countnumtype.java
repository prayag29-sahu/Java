import java.util.*;
public class countnumtype {

    // 7> user numbers count
    public static void count(int num)
    {
        int countpos = 0;
        int countneg = 0;
        int countzero = 0;
        if(num>0)
        {
            countpos++;
            System.out.println("Count of Enter positive numbers :"+countpos);
        } else if(num<0)
        {
            countneg++;
            System.out.println("Count of Enter negative numbers :"+countneg);
        } else if(num==0)
        {
            countzero++;
            System.out.println("Count of Enter Zero numbers :"+countzero);
        }
    } 

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // 7> user numbers count  
        do { 
            System.out.print("Enter 1 for continue and 0 for exit. ");
            int o = sc.nextInt();
            if(o==1)
            {
                System.out.print("Enter a number : ");
                int num = sc.nextInt();
                count(num);
            }
            else if(o==0)
            {
                System.out.println("Exit.");
                break;
            }
            
        } while (true);


    }
}
