/*
public class NullStr {
    public static void main(String[] args) {
    String str = null;
    System.out.println(str.length());
    }
}
 // it thorugh run time error
(Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null)
 */
public class Nullstr {
    public static void main(String[] args) {
        String str = null;
        try{
            System.out.println(str.length());
        }catch(Exception e){ // nullpointerexeption
            System.out.println(e);
        }
        System.out.println("Exeption was handeled");
        
    }
}
/*
java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
Exeption was handeled
 */