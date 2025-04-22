public class RecursionFact {
    public static int fact(int n){
        if(n==0){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factoral of "+num+" is : "+fact(num));
    }
    
}
// Factoral of 5 is : 120
