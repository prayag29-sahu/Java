public class FindLargestOf3 {
    public static void main(String[] args) {
        int a = 12;
        int b = -35;
        int c = -543;
        if(a>b&&a>c)
        {
            System.out.println("Greater Number is = "+a);
        } else   if(b>a&&b>c)
        {
            System.out.println("Greater Number is = "+b);
        } else   if(c>b&&c>a)
        {
            System.out.println("Greater Number is = "+c);
        }
    }
}
// o/p (Greater Number is = 12)