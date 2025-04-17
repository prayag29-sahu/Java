public class CopyElem {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[5];
        for(int i =0;i<arr1.length;i++){
            arr2[i]=arr1[i];
        }
        for(int j =0;j<arr2.length;j++){
            System.out.print(arr2[j]+" ");
        }
    }
}
// 1 2 3 4 5 