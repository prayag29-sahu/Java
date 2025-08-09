
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {

    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

}
	

public class ComparatorUses {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        List<Integer> nums = new ArrayList<>();
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);
        Collections.sort(nums);
        System.out.println(nums);

    }
}
