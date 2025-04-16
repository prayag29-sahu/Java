import java.util.Scanner;

public class GreaterArrayElem {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        System.out.println("Enter elements : ");
        int[] arr = new int[n];
        int max = 0;
        int largest = 0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=arr[max])
            {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    sc.close();
    }
    
}
/*
Enter size : 3
Enter elements : 
45
234
23
234
 */
