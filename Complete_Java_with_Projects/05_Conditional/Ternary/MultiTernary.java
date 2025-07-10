
public class MultiTernary {
    public static void main(String[] args) {
//		int n=4;
//		int result=0;
//		if(n%2==0)
//			result=10;
//		
//		else
//			result =20;
//		System.out.println(result);
		
		int n=11;
		int result=0;
		result = n>10 ? n%2==0 ? 10 : 20 : 30;
		System.out.println(result);
	}


}
// 20