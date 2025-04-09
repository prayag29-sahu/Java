public class CheckCharCase {
    public static void main(String[] args) {
        char ch = 'H';
        if(ch>='A'&&ch<='Z')
        {
            System.out.println(ch+" is UpperCase char.");
        } else  if(ch>='a'&&ch<='z')
        {
            System.out.println(ch+" is LowerCase char.");
        } else {
            System.out.println("Not an Alphabate.");
        }
    }
    
}
// o/p (H is UpperCase char.)