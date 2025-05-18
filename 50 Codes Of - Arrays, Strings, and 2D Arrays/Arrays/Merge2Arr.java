// 19. Merge two sorted arrays without using extra space
public class Merge2Arr {
    public static void main(String[] args) {
        // 2 sorted array
        int[] arr1 = {1,4,6,7,8,10};
        int[] arr2 = {2,3,5,9};
        int[] arr3 = new int[arr1.length+arr2.length];
        for(int i=0;i<arr3.length;i++){
            int j = 0;
            while(j<arr1.length){
                arr3[i]=arr1[j];
                j++;
                i++;
            }
            int k = 0;
            while(k<arr2.length){
                arr3[i]=arr2[k];
                k++;
                i++;
            }
        }
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
    }
}
/*
1 4 6 7 8 10 2 3 5 9
 */