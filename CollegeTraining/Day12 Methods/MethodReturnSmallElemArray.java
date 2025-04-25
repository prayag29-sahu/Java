
public class MethodReturnSmallElemArray {
    static int small(int a[]) {
        int small = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < small) {
                small = a[i];
            }
        }
        return small;
    }

    public static void main(String[] args) {

        int[] a = { 10, 2, 3, 4, 5 };
        System.out.println(small(a));

    }
}
