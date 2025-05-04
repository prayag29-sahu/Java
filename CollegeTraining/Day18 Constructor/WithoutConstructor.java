import java.util.*;
class WithoutConstructor{
	String name = "Sikha";
	int age = 21;
	int mark = 83;
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    System.out.println("2 objects having same o/p");
	WithoutConstructor s1 = new WithoutConstructor();
	System.out.println(s1.name);
	System.out.println(s1.age); 
	System.out.println(s1.mark); 
	WithoutConstructor s2 = new WithoutConstructor();
	System.out.println(s2.name); 
	System.out.println(s2.age); 
	System.out.println(s2.mark);
	}
}
/* 
2 objects having same o/p
Sikha
21
83
Sikha
21
83
 */