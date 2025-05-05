// Overload the method print in a class to accept a string and an integer argument.
class PrintMultis {
    void print(String s){
        System.out.println(s);
    }
    void print(int a){
        System.out.println("Square : "+a*a);
    }
}
public class PrintOverloaded {
    public static void main(String[] args) {
        PrintMultis pm = new PrintMultis();
        pm.print("Print String");
        pm.print(4);
    }    
}
/*
Print String
Square : 16
 */