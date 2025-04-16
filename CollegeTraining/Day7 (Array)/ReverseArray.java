public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int i = 0 ;
        int  s = arr.length-1;
        while(i<s){
            int temp = arr[i];
            arr[i] = arr[s];
            arr[s] = temp;
            i++;
            s--;
        }
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    
    }
    
}
// o/p (5 4 3 2 1 )