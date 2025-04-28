// 24.	WAP to check if a number is a Harshad number
public class CheckHarshadNum {
    public static void main(String[] args) {
        int num = 18; // 1+8 = 9  ,  18 % 9 == 0  (Harshad Number) 
        int m = num;
        int sum = 0;
        while(num>0){
            sum = sum + num%10;
            num = num/10;
        }
        if(m%sum==0){
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not Harshad Number");
        }
    }
}
// Harshad Number