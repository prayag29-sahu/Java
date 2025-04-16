public class Palindrom {
    public static void main(String[] args) {
        int num = 121;
        int a=num;
        int rem;
        int res = 0;
        while(num>0)
        {
            rem = num%10;
            res = res*10 + rem;
            num = num /10;
        }
        if(a==res)
        {
            System.out.println("Yes,Palindrom");
        } else {
            System.out.println("No.Palnidrom");
        }
    }
}
