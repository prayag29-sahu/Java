/*
 * Create a class named Sample with an instance variable data. Create an object and print the
value of data without initializing it. Observe the output.
 */

public class SampleOutput {
    public static class Sample{
        int data;
    }
    public static void main(String[] args) {
        Sample obj1 = new Sample();
        System.out.println(obj1.data);
    }
}
// o/p (0)