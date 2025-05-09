class Student {
    private String name;
    private int marks;
    public void setD(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
    public int getM(){
        return marks;
    }
    public String getN(){
        return name;
    }
    public void print(){
        System.out.println("Name : "+getN());
        System.out.println("Marks : "+getM());
    }
    

}
public class StudentEncap {
    public static void main(String[] args) {
        Student s = new Student();
        s.setD("Roy", 78);
        s.print();
    }
}
/*
Name : Roy
Marks : 78
 */