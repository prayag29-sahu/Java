// 1. Find the maximum and minimum element in an array
import java.util.Scanner;

class MaxMinElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an array : ");
        for(int i=0;i<n;i++){
        }
        int max = arr[0];
        int min = arr[0];
        for(int j=0;j<n;j++){
            if(max<=arr[j]){
                max=arr[j];
            }
            if(min>=arr[j]){
                min=arr[j];
            }
        }
        System.out.println("The maximum element of an array is  : "+max+" And the minimum element of an array is  : "+min);
        sc.close();
    }
}
/*
Enter size of Array : 5
Enter the elements of an array :        
23
54
12
76
34
The maximum element of an array is  : 76 And the minimum element of an array is  : 12
 */