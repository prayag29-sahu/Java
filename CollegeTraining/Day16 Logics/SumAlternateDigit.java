// 3.	WAP to calculate the sum of alternate digits in a number
public class SumAlternateDigit {
    public static void main(String[] args) {
        int a = 12343;
        int sum = 0;
        boolean add = true;
        while(a>0){
            int r  = a%10;
            if(add){
                sum+=r;
            }
            add = !add;
            a=a/10;
        }
        System.out.println(sum);
    }
    
}
// 7
