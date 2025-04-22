public class PrintPrime {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 13, 21, 65, 47 };
        int key = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 2; i < (arr[j]); i++) {
                if (arr[j] % i != 0) {
                    key = 1;

                }else{
                    key = 0;
                }
            }
            if (key == 1) {
                System.out.println("Not Prime number " + arr[j]);
            } else {
                System.out.println("Prime Number " + arr[j]);
            }

        }
    }
}
