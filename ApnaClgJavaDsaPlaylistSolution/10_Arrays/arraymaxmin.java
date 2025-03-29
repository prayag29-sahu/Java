import java.util.*;

public class arraymaxmin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        // input of an array
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        // find the max and min element of an array
        int max = arr[0];
        int min = arr[0];
        for(int j=0;j<size;j++)
        {
            if(arr[j]>max)
            {
                max=arr[j];
            }
            if(arr[j]<min)
            {
                min=arr[j];
            }
        }
        System.out.println("Maximum Element : "+max+" Minimum Element : "+min);

    }
}
