/*
 * Create a class named Test with an instance variable value. Create an object and try to print the
value without assigning any value to it. Observe the output.
 */

public class PrintUnassignValue {
    public static class Test{
        String value;
    }
    public static void main(String[] args) {
        Test obj1 = new Test();
        System.out.println(obj1.value);
    }
    
}
// o/p (0) for int 
// o/p (0.0) for Double 
// o/p ( ) for char 
// o/p (null) for String