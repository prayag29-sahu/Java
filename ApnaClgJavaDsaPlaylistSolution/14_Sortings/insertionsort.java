public class insertionsort{
    public static void main(String[] args) {
        
        int[] a = {21,13,54,34,21,68};
        
        // Insertion sort
        int temp;
        int j;
        for (int i = 1; i < a.length; i++)
        {
            if (a[i] < a[i - 1])
            {
                j = i;
                temp = a[i];
                do{
                    a[j] = a[j - 1];
                    j--;
                } while (j > 0 && a[j - 1] > temp);
                a[j] = temp;
            }
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}