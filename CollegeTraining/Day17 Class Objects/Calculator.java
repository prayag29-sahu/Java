/*
10. Create a class Calculator with methods add, subtract, multiply, and divide. Use objects to call
these methods
 */
class Calcu{
    int a;
    int b;
    Calcu(int m, int n){
        a=m;
        b=n;
    }
    void add(){
        System.out.println("Addition : "+ (a+b));
    }
    void sub(){
        System.out.println("Subtraction : "+ (a-b));
    }
    void multi(){
        System.out.println("Multiplication : "+ (a*b));
    }
    void div(){
        System.out.println("Division : "+ (a/b));
    }

}

public class Calculator {
    public static void main(String[] args) {
        Calcu c = new Calcu(10, 5);
        c.add();
        System.out.println();
        c.sub();
        System.out.println();
        c.multi();
        System.out.println();
        c.div();
    }
    
}
/*
Addition : 15

Subtraction : 5

Multiplication : 50

Division : 2
 */