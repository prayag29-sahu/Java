public class CompressString {
    public static void main(String[] args) {
        String str = "aabbccc";
        char[] arr = new char[10];
        int k=0;
        for (int i = 0; i < str.length(); i++) {
            boolean isCounted = false;
            for (int j = 0; j < i; j++) {
                if ((str.charAt(i)-'0')==((str.charAt(j)-'0'))) {
                    isCounted = true;
                    break;
                }
            }
            
            if (isCounted==false) {
                int count = 0;
                for (int j = 0; j < str.length(); j++) {
                    if ((str.charAt(i)-'0')==(str.charAt(j)-'0')) {
                        count++;
                    }
                }
                char c = (char)(count+'0');
                arr[k++]=str.charAt(i);
                arr[k++]=c;
            }
        }
        for(int i=0;i<=k;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
// a 2 b 2 c 3  