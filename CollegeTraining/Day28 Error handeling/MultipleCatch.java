public class MultipleCatch {
        public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        try {
            System.out.println(arr[6]);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
        }
        System.out.println("its work Using exception.");
    }
}
