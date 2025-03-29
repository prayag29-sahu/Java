import java.util.*;

public class replacechar {

    public static void main(String args[])
    {

    Scanner sc = new Scanner(System.in);

    // replace array string charecter
    String str = sc.nextLine();
    String str1 = "";
    for(int i=0;i<str.length();i++)
    {
        if(str.charAt(i)=='a')
        {
            str1+='o';
        }
        else
        str1+=str.charAt(i);
    }
    System.out.println(str1);

    }
    
}
