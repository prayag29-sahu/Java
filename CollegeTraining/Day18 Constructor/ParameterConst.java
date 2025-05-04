import java.util.Scanner;

public class ParameterConst {
    String name;
	int age;
	int mark;
	ParameterConst(String n, int a, int m){
	name = n;
	age = a;
	mark = m;
	}
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	ParameterConst s1 = new ParameterConst("Sikha",21,83);
	System.out.println(s1.name); 
	System.out.println(s1.age); 
	System.out.println(s1.mark);
	ParameterConst s2 = new ParameterConst("Pankaj",25,56);
	System.out.println(s2.name); 
    System.out.println(s2.age); 
	System.out.println(s2.mark);
	}

}
/*
Sikha
21
83
Pankaj
25
56
 */