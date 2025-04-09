public class StudMarks {
    public static void main(String[] args) {
        int marks = 79;
        if(marks>=90)
        {
            System.out.println("Grade A");
        } else if(marks >=75&&marks<90)
        {
            System.out.println("Grade B");
        } else if(marks>=60&&marks<75)
        {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail.");
        }
    }
    
}
// o/p (Grade B)
