//  27. Longest common prefix
public class LongestCommonPrefix {
        public static void main(String[] args) {
            String str1 = "abcdefg";
            String str2 = "abcefg";
            StringBuilder newstr = new StringBuilder();
            for(int i=0;i<str1.length()-1;i++){
                if(str1.charAt(i)==str2.charAt(i)){
                    newstr.append(str1.charAt(i));
                }
            }
            System.out.println(newstr);
            
        }    
}
// abc