public class Demo {
	public static void main(String[] args) {
		int nums[][]=new int [3][4];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				nums[i][j]=(int)(Math.random()*100);
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
/*
52 88 7 70 
16 46 61 71
73 6 74 82
 */