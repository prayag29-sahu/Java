class tryCatchMethod{
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a/b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("its work Using exception.");
    }
}
/*
java.lang.ArithmeticException: / by zero
its work Using exception.
 */