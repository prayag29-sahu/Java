public class CheckStrongNum {
    public static void main(String[] args) {
        int num = 145;
        int num1 = num;
        int rem;
        int strong = 0;
        while (num > 0) {
            int fact = 1;
            rem = num % 10;
            for (int i = 1; i <= rem; i++) {
                fact = fact * i;
            }
            strong = strong + fact;
            num=num/10;
        }
        if (num1 == strong) {
            System.out.println(strong + " is Strong number.");
        } else {
            System.out.println(strong + " is Not a Strong number.");
        }
    }
}
// 145 is Strong number.
