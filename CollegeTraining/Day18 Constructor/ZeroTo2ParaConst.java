public class ZeroTo2ParaConst {
	ZeroTo2ParaConst(){
		this(5); //  call ZeroTo2ParaConst(int x)
		System.out.println(10);
	}
	ZeroTo2ParaConst(int x){
		this(15,25); 
		System.out.println(20);
	}
	ZeroTo2ParaConst(int x, int y){
		System.out.println(30);
	}
	public static void main(String[] args){
		ZeroTo2ParaConst c = new ZeroTo2ParaConst();
	}

}
/*
30
20
10
 */