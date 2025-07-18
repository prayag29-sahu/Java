public class Jugged {
	public static void main(String[] args) 
	{
		int a[][]=new int [3][]; //jagged
		a[0]=new int [3];
		a[1]=new int [4];
		a[2]=new int [2];
				
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=(int)(Math.random()*10);
                System.out.print(a[i][j]+" ");
			}
            System.out.println();
		}
	}
}
/*
7 4 8 
5 2 9 7
4 3
 */