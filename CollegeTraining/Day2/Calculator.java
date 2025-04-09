class Calculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("Calculate all operations : ");
        System.out.println("Addition of "+a+" and "+b+ " = "+ (a+b));
        System.out.println("Subtraction of "+a+" and "+b+ " = "+ (a-b));
        System.out.println("Multiplication of "+a+" and "+b+ " = "+ (a*b));
        System.out.println("Division of "+a+" and "+b+ " = "+ (a/b));
        System.out.println("Division of "+a+" and "+b+ " = "+ (a%b));
        System.out.println();
        System.out.println("Choise Operation using if else : ");
        char ope = '/';
        if(ope =='+'){
            System.out.println("Addition of "+a+" and "+b+ " = "+ (a+b));
        }else if(ope=='-'){
            System.out.println("Subtraction of "+a+" and "+b+ " = "+ (a-b));
        } else if(ope=='*')
        {
            System.out.println("Multiplication of "+a+" and "+b+ " = "+ (a*b));
        } else if(ope=='/')
        {
            System.out.println("Division of "+a+" and "+b+ " = "+ (a/b));
        } else if(ope=='%')
        {
            System.out.println("Division of "+a+" and "+b+ " = "+ (a%b));
        } else {
            System.out.println("Invalid Operator.");
        }
        System.out.println();
        System.out.println("Choise using switch case operator : ");
        switch(ope)
        {
            case '+':             System.out.println("Addition of "+a+" and "+b+ " = "+ (a+b));
            break;
            case '-':             System.out.println("Subtraction of "+a+" and "+b+ " = "+ (a-b));
            break;
            case '*':             System.out.println("Multiplication of "+a+" and "+b+ " = "+ (a*b));
            break;
            case '/':             System.out.println("Division of "+a+" and "+b+ " = "+ (a/b));
            break;
            case '%':             System.out.println("Division of "+a+" and "+b+ " = "+ (a%b));
            break;
            default :             System.out.println("Invalid Operator.");
        }

    }
}
/*
 * o/p (
 *  Calculate all operations : 
    Addition of 10 and 5 = 15
    Subtraction of 10 and 5 = 5
    Multiplication of 10 and 5 = 50
    Division of 10 and 5 = 2
    Division of 10 and 5 = 0
    
    Choise Operation using if else :
    Division of 10 and 5 = 2
    
    Choise using switch case operator :
    Division of 10 and 5 = 2
)
 */