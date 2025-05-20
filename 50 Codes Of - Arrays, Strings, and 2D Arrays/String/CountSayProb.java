// 26. Count and say problem

public class CountSayProb {
    public static void main(String[] args) {
        String str = "3322251";
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
                System.out.println("("+count+","+str.charAt(i)+")");
            }
        }
    }
}
/*
(2,3)
(3,2)
(1,5)
(1,1)
 */
