
import java.util.Scanner;

public class UserInputArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        try {
        for(int i=0;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        } catch (Exception e) {
            System.out.println("your extra element dosen't print");
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
/*
Enter size of Array : 5
1
2
3
4
5
6
your extra element dosen't print
1 2 3 4 5
 */