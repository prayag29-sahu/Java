public class AlterPosNeg {
    public static void main(String[] args) {
        int[] arr = {2, -1, -2, 3, -3, 9, 6};

        int[] pos = new int[arr.length];
        int[] neg = new int[arr.length];
        int p = 0, n = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                pos[p] = arr[i];
                p++;
            } else {
                neg[n] = arr[i];
                n++;
            }
        }

        int i = 0, j = 0, k = 0;

        while (j < p && k < n) {
            arr[i] = pos[j];
            i++;j++;
            arr[i] = neg[k];
            i++;k++;
        }
        while (j < p) {
            arr[i] = pos[j];
            i++;j++;
        }
        while (k < n) {
            arr[i] = neg[k];
            i++;k++;
        }

        for (i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
// 2 -1 3 -2 9 -3 6