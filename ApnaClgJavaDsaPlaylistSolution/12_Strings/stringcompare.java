
public class stringcompare {

    public static void main(String args[])
    {

    // compare string
    String str1 = "Ram";
    String str2 = "Ram";
    String str3 = "ram";
    String str4 = "Shyam";

    // case of equal
    if(str1.equals(str2))
    {
        System.out.println(str1+" Equal "+str2);
    }
    else{
        System.out.println(str1+" Not Equal "+str2);
    }

    // case of alphabet sensitive
    if(str1.equals(str3))
    {
        System.out.println(str1+" Equal "+str3);
    }
    else{
        System.out.println(str1+" Not Equal "+str3);
    }

    // case of not equal
    if(str1.equals(str4))
    {
        System.out.println(str1+" Equal "+str4);
    }
    else{
        System.out.println(str1+" Not Equal "+str4);
    }

    // not use cases are -

    // case of normal comparesion o/p (Ram Equal Ram)
    if(str1==str2)
    {
        System.out.println(str1+" Equal "+str2);
    }
    else{
        System.out.println(str1+" Not Equal "+str2);
    }

    // case of normal comparesion o/p (Ram Not Equal ram)
    if(str1==str3)
    {
        System.out.println(str1+" Equal "+str3);
    }
    else{
        System.out.println(str1+" Not Equal "+str3);
    }

    // case of normal comparesion o/p (Ram Not Equal Shyam)
    if(str1==str4)
    {
        System.out.println(str1+" Equal "+str4);
    }
    else{
        System.out.println(str1+" Not Equal "+str4);
    }

    // case of normal comparesion o/p (Ram Equal Ram)
    if("Ram"=="Ram")
    {
        System.out.println("Ram"+" Equal "+"Ram");
    }
    else{
        System.out.println("Ram"+" Not Equal "+"Ram");
    }

    // case of normal comparesion o/p (Ram Not Equal ram)
    if("Ram"=="ram")
    {
        System.out.println("Ram"+" Equal "+"ram");
    }
    else{
        System.out.println("Ram"+" Not Equal "+"ram");
    }

    // case of new string comparesion give wrong o/p (Ram Not Equal Ram)
    if(new String("Ram") == new String("Ram"))
    {
        System.out.println("Ram"+" Equal "+"Ram");
    }
    else{
        System.out.println("Ram"+" Not Equal "+"Ram");
    }

    }
    
}
