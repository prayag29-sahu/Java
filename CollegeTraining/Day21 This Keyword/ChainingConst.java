class Print {
    Print(){
        this(5);
        System.out.println("Hii");
    }
    Print(int a){
        this(3,5);
        System.out.println(a);
    }
    Print(int a,int b){
        System.out.println(a+b);
    }
}
public class ChainingConst {
    public static void main(String[] args) {
        Print p = new Print();
    }
}
/*
8
5
Hii
 */