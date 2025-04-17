

public class TwoArrayElemSum {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {10,20,30,40,50};
        int[] sum = new int[5];
        for(int i = 0;i<arr1.length;i++){
            sum[i] = arr1[i]+arr2[i];
        }
        for(int j=0;j<arr1.length;j++){
            System.out.println(sum[j]+" ");
        }


    }
}
/*
11 
22
33
44
55
 */