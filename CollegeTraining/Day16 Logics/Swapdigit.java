// 2. WAP to swap first and last digit of a number
class Swapdigit {
    public static void main(String[] args) {
        int a = 2341;
        int f = a;
        int l = a%10;
        while(f>10){
            
            f=f/10;
        }
        int rem = a%(int)Math.pow(10,(int)Math.log10(a));
        int swap = l*(int)Math.pow(10,(int)Math.log10(a)) + rem - (rem%10)+f;
        System.out.println(swap);
    }
}
// 1342