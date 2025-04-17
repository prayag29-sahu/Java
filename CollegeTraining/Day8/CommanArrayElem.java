public class CommanArrayElem {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 1, 20, 30, 4, 50 };
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println("Equal element are : " + arr1[i]);
                }
            }
        }
    }
}
/*
 * Equal element are : 1
 * Equal element are : 4
 */