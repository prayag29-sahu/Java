/*
Write a program where you overload a method display in such a way that it can print an array of integers, an array of strings, and a 2D array of integers.
 */
class MultipleArray {
    void array(int arr[], int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    void array(String arr[], int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    void array(int arr[][], int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
public class ArrayOverloaded {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        String[] sarr = {"aman","baman","caman","davan","havan"};
        int[][] darr = {{1,2},{3,4}};
        MultipleArray ma = new MultipleArray();
        ma.array(arr, 5);
        System.out.println();
        ma.array(sarr, 5);
        System.out.println();
        ma.array(darr, 2);
    }
}
/*
1 2 3 4 5 
aman baman caman davan havan
1 2 3 4
 */
