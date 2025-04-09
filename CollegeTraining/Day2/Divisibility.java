public class Divisibility {
    public static void main(String[] args) {
        int n = 55;
        if(n%5==0&&n%11==0)
        {
            System.out.println(n+" is divisible by both 5 and 11.");
        } else{
            System.out.println(n+" is not divisible by both 5 and 11.");
        }
    }
    
}
// o/p (55 is divisible by 5 and 11.)