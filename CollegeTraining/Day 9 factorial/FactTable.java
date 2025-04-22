public class FactTable {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        for(int i=1;i<=n;i++)
        {
            fact = fact*i;
            System.out.println(i + " x " + (i == 1 ? 1 : (i - 1) + "!") + " = " + fact);

        }
    }
}
/*1 x 1 = 1
2 x 1! = 2
3 x 2! = 6
4 x 3! = 24
5 x 4! = 120
 */