public class CompareArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        for(int i =0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i])
            {
                System.out.println("Not Equal");
                return;
            }
        }
        System.out.println("Equal");
    }
    
}
// Equal