class Human
{
	private int age;
	private String name;
	
	public Human()
	{
		age=12;
		name="John";
	}
	public Human(String name) {
		this.age=age;
		this.name=name;
	}
	public Human(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
	
	
	public int getAge(){
		return age;
	}
	public void SetAge(int age)
	{
		this.age=age;
	}	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
}

public class Species {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Human obj=new Human();
		System.out.println(obj.getName()+" : "+obj.getAge());
	}
}


