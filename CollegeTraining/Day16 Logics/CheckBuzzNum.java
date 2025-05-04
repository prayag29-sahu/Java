// 5.	WAP to check if a number is a Buzz number( number end with 7 and divisible by 7)
public class CheckBuzzNum {
    public static void main(String[] args) {
        int a = 49;
        int l = (a%10);
        if(a%7==0||l==7){
            System.out.println(a+" Buzz number.");
        }else{
            System.out.println(a+" Not a Buzz number.");
        }
    }
}
