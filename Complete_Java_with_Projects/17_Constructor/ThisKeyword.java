

class A
{
	public A() 
	{
		System.out.println("in A");
	}
	public A(int n)
	{
		System.out.println("in A int");
	}
}

class B extends A
{
	public B()
	{
		System.out.println("in B");
	}
	public B(int n)
	{
		this();  //call constructor of same class
		System.out.println("in B int");
	}
}
public class ThisKeyword {
	public static void main(String[] args) 
	{
		B obj=new B(5);
	}
}

/*
in A
in B
in B int
 */