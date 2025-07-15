class Calculator {

    public int add (int a,int b){
        return a+b;
    }
    public int add (int a,int b,int c){
        return a+b+c;
    }
    public double add (double  a,int b,int c){
        return a+b+c;
    }
    
}

public class method {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int addition = cal.add(2, 4);
        System.out.println(addition);
        addition = cal.add(2, 4,5);
        System.out.println(addition);
        double res = cal.add(5, 2,7);
        System.out.println(res);
    }
}
