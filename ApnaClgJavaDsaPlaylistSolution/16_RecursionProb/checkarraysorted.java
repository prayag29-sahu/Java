

public class checkarraysorted {
    public static boolean check(int a[],int index)
    {
        if(index==a.length-1)
        {
            return true;
        }
        if(!check(a, index+1))
        {
            return false;
        }
        return a[index]<a[index+1];
    }
    public static void main(String[] args) {
        int[] a = {1,12,12,4,5};
        if(check(a,0))
        {
            System.out.println("Array is an Sorted Order");
        } else 
        {
            System.out.println("Array is an Unsorted Order");
        }
    }
    
}
