import java.util.ArrayList;
import java.util.Collections;

public class shuffel {
    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(30);
        arr.add(20);
        arr.add(50);
        arr.add(40);
        Collections.sort(arr);
        System.out.println(arr);
        Collections.shuffle(arr);
        System.out.println(arr);
    }
}
/*
[10, 20, 30, 40, 50]
[30, 20, 50, 40, 10]
 */