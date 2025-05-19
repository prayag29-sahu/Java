public class CheckPalindrome {
     public static void main(String[] args) {
        String str = "naman";
        String strnew = "";
        for(int i=str.length()-1;i>=0;i--){
            strnew+=str.charAt(i);
        }
        if(str.compareTo(strnew)==0){
            System.out.println("String was palindrom");
        }else{
            System.out.println("String was not a palindrom");
        }
    }
}
// o/p String was palindrom
