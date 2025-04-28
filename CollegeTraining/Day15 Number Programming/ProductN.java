// 5.	WAP to find product of 'n' natural numbers
public class ProductN {
    public static void main(String[] args) {
        int n = 5;
        int pro = 1;
        for(int i=1;i<=n;i++){
            pro*=i;
        }
        System.out.println(pro);
    }
}
// 120