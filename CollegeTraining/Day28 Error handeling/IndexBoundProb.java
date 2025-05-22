public class IndexBoundProb {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int a=7;
        try {
            System.out.println(arr[a]);
        } catch (Exception e) {
            System.out.println("Array indexing outof bound.");
        }
        System.out.println("its work.");
    }
}
/*
Array indexing outof bound.
its work.
 */