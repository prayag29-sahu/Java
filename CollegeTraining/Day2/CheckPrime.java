public class CheckPrime {
    public static void main(String[] args) {
        int num = 47;
        for(int i=2;i<=(num/2);i++)
        {
            if(num%i==0)
            {
                System.out.println(num+" is not prime number.");
                return;
            }
        }
        System.out.println(num+" is prime number.");
    }
    
}
//  o/p (47 is prime number.)
