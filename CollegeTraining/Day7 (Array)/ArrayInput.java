import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        System.out.println("Enter elements : ");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    sc.close();
    }
    
}
/*
Enter size : 5
Enter elements :
1
2
3
4
5
1 2 3 4 5
 */





