public class TryCatchFinally {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        try {
            System.out.println(arr[6]);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
        }finally{
            System.out.println("It always work.");
        }
        System.out.println("its work Using exception.");
    }
}
/*
java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 4
It always work.
its work Using exception.
 */