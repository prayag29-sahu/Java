public class Finallystr {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } finally {
            System.out.println("Finally block executed");
        }
        System.out.println("hii");
    }
}
/* only finally block run and after it give error
Finally block executed
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null   
        at Finallystr.main(Finallystr.java:5)
 */