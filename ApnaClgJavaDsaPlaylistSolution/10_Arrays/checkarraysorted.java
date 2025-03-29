import java.util.*;

public class checkarraysorted {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        // input of an array
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        // check elements of array are sorted ?
        int sort =1;
        for(int i=0;i<size-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                sort = 0;              
            }
        }
        if(sort==1)
        {
            System.out.println("Inputed Array elements are sorted ");
        } else{
            System.out.println("Inputed Array elements are Not sorted.");
        }


    }
}
