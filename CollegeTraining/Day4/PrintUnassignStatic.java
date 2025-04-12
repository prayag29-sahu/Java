/*
 * Create a class named Demo with a static variable count. Try to print the value of count without
assigning any value to it. Observe the output.
 */

public class PrintUnassignStatic {
    public static class Demo{
        static int count;
    }
    public static void main(String[] args) {
        Demo obj1 = new Demo();
        System.out.println(obj1.count);
    }
}
// o/p (0)