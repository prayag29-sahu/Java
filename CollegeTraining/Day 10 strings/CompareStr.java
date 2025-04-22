public class CompareStr {
    public static void main(String[] args) {
        String str = "hello";
        String str1 = "hilli";
        int count = 0;
        for(int i=0;i<str.length();i++){
        if(str.charAt(i)==(str1.charAt(i)))
        {
            System.out.println(str.charAt(i)+" is equal in both");
            count++;
        }
        }
        System.out.println(count);
    }
    
}
