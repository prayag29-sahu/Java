import java.util.*;

public class fullstringlength {

    public static void main(String args[])
    {

    Scanner sc = new Scanner(System.in);

    int s = sc.nextInt();
    String[] a = new String[s];
    int length = 0;

    for(int i=0;i<s;i++)
    {
        a[i] = sc.next();
        length = length + a[i].length();
    }
    System.out.println(length);

    }
    
}
