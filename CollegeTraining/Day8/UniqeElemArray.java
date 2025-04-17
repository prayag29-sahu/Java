public class UniqeElemArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,20,30,4,50};
        for(int i =0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i])
            {
                System.out.println("Uniqe element are : "+arr1[i]+" "+arr2[i]);
            }
        }
    }
}
/*
Equal element are : 2 20
Equal element are : 3 30
Equal element are : 5 50
 */
