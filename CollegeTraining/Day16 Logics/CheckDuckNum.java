// 4. WAP to check whether the number is duck number (which contain atleast one zero not start with zero)
public class CheckDuckNum {
    public static void main(String[] args) {
        int a = 10243;
        int b=a;
        boolean c = false;
        while(a>=10){
            int rem = a%10;
            if(rem==0){
                c = true;
            }
            a=a/10;
        }
        if(a==0){
            c=false;
        }
        if(c==true){
            System.out.println(b+" is Duck Number.");
        } else {
            System.out.println(b+" Not a duck number.");
        }
    }
}
// 10243 is Duck Number.