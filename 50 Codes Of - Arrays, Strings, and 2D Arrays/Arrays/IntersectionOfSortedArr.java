// 17. Find intersection of two sorted arrays

public class IntersectionOfSortedArr {
    public static void main(String[] args) {
        // 2 sorted array 
        int[] arr1 = {1,12,23,34,45};
        int[] arr2 = {2,12,32,34,54};
        System.out.print("Intersection: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }
}
// o/p Intersection: 12 34
