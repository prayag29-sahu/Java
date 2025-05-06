class Print {
    Print(){
        System.out.println("Hii");
    }
    Print(int a){
        this();
        System.out.println(a);
    }
    Print(int a,int b){
        this(5);
        System.out.println(a+b);
    }
}
public class ThisChaining {
    public static void main(String[] args) {
        Print p = new Print(3,4);
    }
}
/*
Hii
5
7
 */