public class TryFinally {
        public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        try {
            System.out.println(arr[6]);
        } finally{
            System.out.println("It always work.");
        }
        System.out.println("its work Using exception.");
    }
}
/*
It always work.
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 4
        at TryFinally.main(TryFinally.java:5)
 */
