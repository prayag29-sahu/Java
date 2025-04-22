public class CountTrailling0 {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        for(int i=1;i<=n;i++)
        {
            fact = fact*i;
        }
        System.out.println(fact);
        int rem;
        int count=0;
        while(fact>0)
        {
            rem = fact%10;
            if(rem==0){
                count++;
            }
            fact = fact/10;
        }
        System.out.println("The number of Zero presents : "+count);
    }    
}
/*
120
The number of Zero presents : 1
 */
