public class MaxElemof2Array {
    public static void main(String[] args) {
        int[] arr1 = {11,2,300,4,55};
        int[] arr2 = {10,20,30,40,50};
        for(int i = 0;i<arr1.length;i++){
            if(arr1[i]>arr2[i]){
                System.out.println("Max elements : "+arr1[i]);
            }
            else{
                System.out.println("Max elements : "+arr2[i]);
            }
        }


    }
}
/*
Max elements : 11
Max elements : 20
Max elements : 300
Max elements : 40
Max elements : 55
 */