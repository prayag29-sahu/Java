
import java.util.ArrayList;

public class findsubsets {
    public static void printsubset(ArrayList<Integer> subset){
        for(int i=0;i<subset.size();i++)
        {
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void subsets(int n,ArrayList<Integer> subset)
    {
        if(n==0)
        {
            printsubset(subset); 
            return;
        }
        subsets(n-1, subset);
        subset.add(n);
        subsets(n-1, subset);
        subset.remove(subset.size()-1);


    }
    public static void main(String args[])
    {
        int num = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        subsets(num,subset);
    }
}
