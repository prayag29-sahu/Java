package Java.Complete_Java_with_Projects.20_Packages.tools;
// This file is part of the tools package, which contains basic calculator functionalities.

class AdvCalc extends calc {
    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}