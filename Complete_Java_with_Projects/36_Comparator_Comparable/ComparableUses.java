
import java.util.ArrayList;
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

//	public int CompareTo(Student that)
//	{


////		return 0;
//		if(this.age >that.age)
//			return 1;
//		else
//			return -1;
//	}
}
	

public class ComparableUses {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Comparator<Student> com = (i, j) -> i.age > j.age ? 1 : -1;

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "Prayag"));
        studs.add(new Student(12, "Aditya"));
        studs.add(new Student(18, "lucky"));
        studs.add(new Student(20, "Nitin"));

        for (Student s : studs) {
            System.out.println();
        }
        // Collections.sort(studs); // objects are not shorted
        for (Student s : studs) {
            System.out.println(s);
        }
    }
}
