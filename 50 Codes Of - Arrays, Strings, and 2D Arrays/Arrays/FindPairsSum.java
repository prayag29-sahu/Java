public class FindPairsSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n=6;
        int sum=arr[0];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                sum=arr[i]+arr[j];
                if(sum==n){
                    System.out.println("{"+arr[i]+","+(arr[j])+"}");
                }
            }
        }
    }
}
// {1,5}
// {2,4}
