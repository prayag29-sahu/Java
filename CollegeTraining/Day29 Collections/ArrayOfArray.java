import java.util.ArrayList;

public class ArrayOfArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr =new ArrayList<>();
        ArrayList<Integer> subarr1 = new ArrayList<>();
        ArrayList<Integer> subarr2 = new ArrayList<>();
        subarr1.add(1);
        subarr1.add(2);
        subarr1.add(3);
        subarr2.add(4);
        subarr2.add(5);
        subarr2.add(6);
        arr.add(subarr1.get(1));
        arr.add(subarr2.get(1));
        System.out.println("Arraylist : "+arr);
    }
}
// Arraylist : [2, 5]