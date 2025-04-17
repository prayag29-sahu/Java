public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 10, 20, 30, 40, 50 };
        int[] merge = new int[arr1.length + arr2.length];
        int l = arr1.length;
        for (int i = 0; i < arr1.length; i++) {
            merge[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            merge[l] = arr2[i];
            l++;
        }
        for (int i = 0; i < arr1.length + arr2.length; i++) {
            System.out.println(merge[i] + " ");
        }
    }
}
/*
 * 1
 * 2
 * 3
 * 4
 * 5
 * 10
 * 20
 * 30
 * 40
 * 50
 */