class A extends Object
{
	int num= 1;
}

class B extends A
{
	int num=2;
	public int getValue()
	{
		int num=3;
		// return num; // return 3
		// return this.num;  // return 2
		return super.num;  // return 1
	}
}


public class ThisVsSuper
{
	public static void main(String a[]) 
	{
		B obj=new B();
		System.out.println(obj.num);  // 2
		System.out.println(obj.getValue());  // 1
	}
}