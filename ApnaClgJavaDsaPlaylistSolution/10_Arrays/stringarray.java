import java.util.*;

public class stringarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();



        // input / output the string array 
        String[] names = new String[size];
        for(int i=0;i<size;i++)
        {
            names[i]=sc.next();
        }
        for(int i=0;i<size;i++)
        {
            System.out.print("Name "+(i+1)+" is "+names[i]+" ");
        }

    }
}
