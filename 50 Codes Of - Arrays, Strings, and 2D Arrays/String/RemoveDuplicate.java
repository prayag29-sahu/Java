public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "aaadvsdv";
        String newstr = "";
        for(int i=0;i<str.length();i++){
            boolean check = false;
            for(int j=0;j<i;j++){
                if(str.charAt(i)==str.charAt(j)){
                    check = true;
                    break;
                }
            }
            if(!check){
                newstr+=str.charAt(i);
            }
        }
        System.out.println(newstr);
    }
}
// o/p advs