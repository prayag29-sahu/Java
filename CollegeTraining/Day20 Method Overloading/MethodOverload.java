/*
 * Method Overloading Questions:
Write a program to demonstrate method overloading.

 */
class MultiPrint {
    void print() {
        System.out.println("Print");
    }

    void print(String s) {
        System.out.println(s);
    }
}

class MethodOverload {
    public static void main(String[] args) {
        MultiPrint p = new MultiPrint();
        p.print();
        p.print("Parameter overloaded Print");
    }
}
// Print
// Parameter overloaded Print