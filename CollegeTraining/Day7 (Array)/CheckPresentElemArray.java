import java.util.Scanner;

public class CheckPresentElemArray {
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        System.out.println("Enter elements : ");
        int[] arr = new int[n];
        int elem = 3;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==elem)
                {
                    System.out.println("Present at index : "+(i+1));
                    return;
                }
        }
        System.out.println("Not Found");
    sc.close();
    }
}
/*
Enter size : 5
Enter elements :
12
3
12
4
5
Present at index : 2
 */