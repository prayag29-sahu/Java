
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
// sort the array by a last digit of numbers
class ComparatorDemo{
    public static void main(String[] args) {
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i,Integer j){
                if(i%10>j%10){
                    return 1;
                }else {
                    return -1;
                }
            }
        };
        ArrayList<Integer> num = new ArrayList<>();
        num.add(23);
        num.add(12);
        num.add(36);
        num.add(65);
        Collections.sort(num,com);
        System.out.println(num);
    }
}
// [12, 23, 65, 36]