import java.util.Scanner;

public class ThisKey {
    String name;
	int age;
	int mark;
	ThisKey(String name, int age, int mark){
	this.name = name;
	this.age = age;
	this.mark = mark;
	}
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    System.out.println("using this the variable and constructor parameter having same name ");
	ThisKey s1 = new ThisKey("Sikha",21,83);
	System.out.println(s1.name); 
	System.out.println(s1.age); 
	System.out.println(s1.mark);
	ThisKey s2 = new ThisKey("Pankaj",25,56);
	System.out.println(s2.name);
	System.out.println(s2.age); 
    System.out.println(s2.mark); 
	}

}
/*
using this the variable and constructor parameter having same name 
Sikha
21
83
Pankaj
25
56
 */