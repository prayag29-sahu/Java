public class CompTarget {
    // public static void main(String[] args) {
    //     String comp = "racecar";
    //     char target ='r';
    //     int count=0;
    //     for(int i=0;i<comp.length();i++)
    //     {
    //         if(comp.charAt(i)==target)
    //         {
    //             count++;
    //         }
    //     }
    //     System.out.println(count);
    // }

    public static void main(String[] args) {
        String palin = "ApplAe";
        String check ="";
        for(int i=0;i<palin.length();i++)
        {
            for(int k=0;k<check.length();k++){
                if(palin.charAt(i)==check.charAt(k)){
                    i++;
                }
            }
            int count = 0;
            for(int j=0;j<palin.length();j++)
            {
                if(palin.charAt(i)==palin.charAt(j))
                {
                    count++;
                }
            }
            System.out.println(palin.charAt(i)+" Repeat "+count+" Time.");
            check= check+palin.charAt(i);
        }
        System.out.println(check);
    }

}
