
public class TypeConversion {
    public static void main(String[] args) {
		byte b=127;
		int a=b;
		System.out.println(b);
		System.out.println(a);
		
		byte b1=125;
		int a0=b1;
		System.out.println(b1);
		System.out.println(a0);
		
		int aa=257;
		byte k=(byte)aa;
		
		float f=5.6f;
		int t=(int)f;
		
		int a2=2567;
		byte b2=(byte)a2;
		System.out.println(b2);
		
		byte a3=10;
		byte b4=20;
		int h= a3*b4;
		System.out.println(h);
	
	}
}
/*
127
127
125
125
7
200
 */