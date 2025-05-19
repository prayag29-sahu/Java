public class ReverseStr {
    public static void main(String[] args) {
        String str = "Naman";
        String strnew = "";
        for(int i=str.length()-1;i>=0;i--){
            strnew+=str.charAt(i);
        }
        System.out.println(strnew); // namaN
    }
}
