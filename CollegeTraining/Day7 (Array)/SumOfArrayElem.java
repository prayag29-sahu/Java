import java.util.Scanner;

public class SumOfArrayElem {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        System.out.println("Enter elements : ");
        int[] arr = new int[n];
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    sc.close();
    }
    
}
// o/p (15)