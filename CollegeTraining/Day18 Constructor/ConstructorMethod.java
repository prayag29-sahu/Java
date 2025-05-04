import java.util.Scanner;

public class ConstructorMethod {
    	String name;
	int age;
	int mark;
	ConstructorMethod(String name, int age, int mark){
	this.name = name;
	this.age = age;
	this.mark = mark;
	}
	void display(){
	System.out.println(name);
	System.out.println(age);
	System.out.println(mark);
	}
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	ConstructorMethod s1 = new ConstructorMethod("Sikha",21,83);
	s1.display();
	ConstructorMethod s2 = new ConstructorMethod("Pankaj",25,56);
	s2.display();
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