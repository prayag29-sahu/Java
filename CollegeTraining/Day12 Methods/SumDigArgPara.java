public class SumDigArgPara {

    // sum of digits
    static void sum(int a) {
        int rem;
        int sum = 0;
        while (a > 0) {
            rem = a % 10;
            sum = sum + rem;
            a = a / 10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        // sum of digits
        sum(123); // o/p 6
    }

}
