
class Calc 
{
	public int add(int n1, int n2)
	{
		return n1+n2;
	}
	public int sub(int n1, int n2)
	{
		return n1-n2; 
	}
}
class AdvCalc extends Calc
{
	public int add(int n1, int n2)
	{
		return n1+n2+1;
	}
}
class SuperCalcu extends AdvCalc {
	public int add(int n1, int n2)
	{
		return n1+n2+2;
	}
    public int sub(int n1, int n2)
	{
		return n1+n2-2;
	}
}


public class OverrideCalcuFunc{
	public static void main(String args[])
	{
	
		SuperCalcu obj = new SuperCalcu();
		int r1=obj.add(3, 4);
		int r2=obj.sub(5,3);
		System.out.println(r1);
		System.out.println(r2);
	}
}