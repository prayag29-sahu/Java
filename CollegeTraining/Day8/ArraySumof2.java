class ArraySumof2 
{
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {10,20,30,40,50};
        int sum = 0;
        for(int i=0;i<arr1.length;i++)
        {
            sum = sum+arr1[i];
        }
        for(int j=0;j<arr2.length;j++)
        {
            sum = sum+arr2[j];
        }
        System.out.println(sum);


    }
}
// 165