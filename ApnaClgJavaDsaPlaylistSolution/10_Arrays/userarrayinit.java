import java.util.*;

public class userarrayinit {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        // input of an array
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        // o/p of an array elements
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
