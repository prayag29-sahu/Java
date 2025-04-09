public class FindLargestOf2 {
    public static void main(String[] args) {
        int a = 34;
        int b = -13;
        if(a>b)
        {
            System.out.println("Greater number is = "+ a);
        }
        else{
            System.out.println("Greater number is = "+b);
        }
        char p = 'A';
        char q = 'T';
        if(p>q)
        {
            System.out.println("Greater Charecter is = "+ p);
        }
        else{
            System.out.println("Greater Charecter is = "+q);
        }
        long l = 1234;
        double d = 12345;
        if(l>d)
        {
            System.out.println("Greater Charecter is = "+ l);
        }
        else if(d>l){
            System.out.println("Greater Charecter is = "+d);
        } else{
            System.out.println("Both equal.");
        }
    }
    
}
// o/p (Greater number is = 34
//      Greater Charecter is = T   (char comparasion based on ASCII values.)
//      Greater Charecter is = 12345.0) answer according to priority of greater 
