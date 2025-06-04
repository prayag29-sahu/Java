public class CheckSubsequence {
    public static void main(String[] args) {
        String str = "abc";
        String str1 = "dabbfksc";
        int i=0,j=0;
        while(i<str.length()&&j<str1.length()){
            if(str.charAt(i)==str1.charAt(j)){
                i++;
            }
            j++;
        }
        if(i==str.length()){
            System.out.println("Its a SubSequence");
        } else{
            System.out.println("Its not a SubSequence");
        }
    }
}
// Its a SubSequence