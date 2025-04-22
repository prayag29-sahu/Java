public class ReverseStr {
    public static void main(String[] args) {
        String palin = "racecar";
        String palin2="";
        for(int j=palin.length()-1;j>=0;j--)
        {
            palin2=palin2+palin.charAt(j);
        }
        for(int i=0;i<palin.length();i++)
        {
            if(palin.charAt(i)!=palin2.charAt(i))
            {
                System.out.println("Not Palindrom");
                return;
            }
        }
        System.out.println("Palindrom");
    }
    
}
