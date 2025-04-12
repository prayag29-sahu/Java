/*
 * Create a class named MathOperations inside the main method that declares two local variables
x and y. Print the product.
 */

public class Product {
    public static void main(String[] args) {
        class MathOperation{
            int x,y;

            public MathOperation(int a,int b) {
                x=a;
                y=b;
            }
            int multi()
            {
                return x*y;
            }
        }
        MathOperation pro = new MathOperation(4,5);
        System.out.println("The multiplication of 2 local variable = "+pro.multi());
    }
    
}
// o/p (The multiplication of 2 local variable = 20)
