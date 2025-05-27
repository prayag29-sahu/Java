
import java.util.ArrayList;
import java.util.Collections;

class Arraylist{
    public static void main(String[] args) {
        ArrayList<Integer> arr =new ArrayList<>();
        arr.add(34);
        arr.add(24);
        arr.add(36);
        arr.set(1, 32);
        System.out.println("Get method  : "+arr.get(1));
        System.out.println("Arraylist : "+arr);
        arr.add(56);
        arr.remove(0);
        // for sorting
        Collections.sort(arr);
        System.out.println("Sorted arraylist : "+arr);
        arr.clear();
        System.out.println("Arraylist : "+arr);
        
    }
}
/*
Get method  : 32
Arraylist : [34, 32, 36]
Sorted arraylist : [32, 36, 56]
Arraylist : []
 */