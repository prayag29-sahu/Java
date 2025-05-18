
public class Sort2ArrUsigMerge {
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
        for (int i = 0; i < arr3.length - 1; i++) {
            for (int j = 0; j < arr3.length - i - 1; j++) {
                if (arr3[j] > arr3[j + 1]) {
                    int temp = arr3[j];
                    arr3[j] = arr3[j + 1];
                    arr3[j + 1] = temp;
                }
            }
        }
        for(int i=0;i<arr3.length;i++){
            int j = 0;
            while(j<arr1.length){
                arr1[j]=arr3[i];
                j++;
                i++;
            }
            int k = 0;
            while(k<arr2.length){
                arr2[k]=arr3[i];
                k++;
                i++;
            }
        }
        System.out.println("First soted array : ");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println("\nSecond sorted array :");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
/*
First soted array : 
1 2 3 4 5 6
Second sorted array :
7 8 9 10
 */