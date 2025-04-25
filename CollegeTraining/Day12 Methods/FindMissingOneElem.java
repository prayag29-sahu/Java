
public class FindMissingOneElem {
    public static void main(String[] args) {
        int[] a = { 2, 1, 4 };
        int m = 0;
        int sumn=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > m) {
                m = a[i];
            }
             sumn = (m * (m + 1)) / 2;
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println(sumn-sum); // o/p (3)
    }

}
