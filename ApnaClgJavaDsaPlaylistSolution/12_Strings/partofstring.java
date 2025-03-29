import java.util.*;

public class partofstring {

    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);

    // show the part of string
    String str = sc.nextLine();
    String str1 = "";
    for(int i=0;i<str.length();i++)
    {
        if(str.charAt(i)=='@')
        {
            break;
        }
        else
        str1+=str.charAt(i);
    }
    System.out.println(str1);

    }
    
}
