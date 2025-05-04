import java.util.Scanner;

public class VarConstPeraSameName {
    String name;
	int age;
	int mark;
	VarConstPeraSameName(String name, int age, int mark){
	name = name;
	age = age;
	mark = mark;
	}
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    System.out.println("variable of constructor parameter having same name");
	VarConstPeraSameName s1 = new VarConstPeraSameName("Sikha",21,83);
	System.out.println(s1.name);
	System.out.println(s1.age);
	System.out.println(s1.mark); 
	VarConstPeraSameName s2 = new VarConstPeraSameName("Pankaj",25,56);
	System.out.println(s2.name);
	System.out.println(s2.age); 
	System.out.println(s2.mark);
	}

}
/*
variable of constructor parameter having same name
null
0
0
null
0
0
 */