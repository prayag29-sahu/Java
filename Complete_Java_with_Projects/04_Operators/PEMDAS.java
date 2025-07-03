public class PEMDAS {
    public static void main(String[] args) {
        double res = 3+4*(7-5)/2+5*3-6/2;
        // PEMDAS: Parentheses, Exponents, Multiplication and Division 
        System.out.println("Result: " + res); // Result: 20.0
        // Explanation: The expression is evaluated as follows:
        // 1. Parentheses: (7-5) = 2
        // 2. Multiplication and Division (left to right):
        //    4*2/2 = 4
        //    5*3 = 15
        //    6/2 = 3
        // 3. Final addition and subtraction (left to right):
        //    3 + 4 + 15 - 3 = 20
    }
}
