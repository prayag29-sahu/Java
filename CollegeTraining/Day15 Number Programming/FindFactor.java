// 11.	WAP to find all factors of a given number
public class FindFactor {
    public static void main(String[] args) {
        int n = 33;
        for(int i = 1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
// 1 3 11 33 