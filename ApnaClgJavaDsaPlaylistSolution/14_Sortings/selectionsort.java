public class selectionsort{
    public static void main(String[] args) {
        
        int[] a = {21,13,54,34,21,68};

        // selection sort
        for(int i=0;i<a.length-1;i++)
        {
            int minimum = i;
            for(int j=i+1;j<a.length-1;j++)
            {
                if(a[j]<a[minimum])
                {
                    minimum = j;
                }
            }
            int temp = a[minimum];
            a[minimum]=a[i];
            a[i]=temp;
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}