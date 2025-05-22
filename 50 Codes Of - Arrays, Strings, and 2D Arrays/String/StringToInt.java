// 28. Convert string to integer (like atoi) 
public class StringToInt {
    public static void main(String[] args) {
        String str = "343";
        int d = str.length()-1;
        int i=0;
        int a=0;
        int b=0;
        while(d>=0){ // 2,1
            char rem=str.charAt(i); // 3,4,3
            int r = rem-'0'; // 3,4,3
            a = (int)(r* Math.pow(10,d)); // 3*10^2=300, 4*10=40, 3*1=3
            b+=a;// 300,340,343
            i++;//1,2,3
            d--;//1,0,-1
        }
            // Java Funtion to convert string to int
            // int b = Integer.parseInt(str);
            // System.out.println(b);
            System.out.println(b);
            
    }

}
// 343