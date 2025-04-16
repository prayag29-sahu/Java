import java.util.Scanner;

public class EvenOddCountArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        System.out.println("Enter elements : ");
        int[] arr = new int[n];
        int countE = 0;
        int countO = 0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
                countE++;
            else
                countO++;
        }
        System.out.println("Even Count : "+countE+" Odd Count : "+countO);
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
Even Count : 2 Odd Count : 3
 */