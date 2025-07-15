class AdvCalcu {
    
    public double power(int a,int b){
        return Math.pow(a, b);
    }
}

class ScinCalcu {

    public double sine(int num1){
        return Math.sin(num1);
    }
}

class Calculator {

    int a;

    public int add(int n1, int n2) {
        a = n1 + n2;
        return a;
    }
    public int sub(int n1, int n2) {
        a = n1 - n2;
        return a;
    }
}

public class Calcu {

    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 5;
        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);
        System.out.println(result);
        result = calc.sub(num1, num2);
        System.out.println(result);
        AdvCalcu adv = new AdvCalcu();
        double r = adv.power(num1, num2);
        System.out.println(r);
        ScinCalcu sci = new ScinCalcu();
        System.out.println(sci.sine(num1));

    }
}
