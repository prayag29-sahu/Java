public class sorting{
    public static void main(String[] args) {
        
        int[] a = {21,13,54,34,21,68};

        // Bubble sort
        // for(int i=0;i<a.length-1;i++)
        // {
        //     for(int j=0;j<a.length-i-1;j++)
        //     {
        //         if(a[j]>a[j+1])
        //         {
                    // int temp = a[j];
                    // a[j]=a[j+1];
                    // a[j+1]=temp;
        //         }
        //     }
        // }


        // selection sort
        // for(int i=0;i<a.length-1;i++)
        // {
        //     int minimum = i;
        //     for(int j=i+1;j<a.length-1;j++)
        //     {
        //         if(a[j]<a[minimum])
        //         {
        //             minimum = j;
        //         }
        //     }
        //     int temp = a[minimum];
        //     a[minimum]=a[i];
        //     a[i]=temp;
        // }

        
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