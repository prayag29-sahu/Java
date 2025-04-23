public class MaxRepeatChar {
    public static void main(String[] args) {
        String palin = "ApplAAe";
        String check ="";
        String ch ="";
        int max=0;
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
            if(count>max){
                ch = ch+palin.charAt(i);
            max=count;}
            // System.out.println(palin.charAt(i)+" Repeat "+count+" Time.");
            check= check+palin.charAt(i);
        }
        System.out.println(ch+" "+max);
    }
}
