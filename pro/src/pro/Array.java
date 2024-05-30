package pro;


public class Array {

	public static void main(Str[] args) {
		// TODO Auto-generated method stub
		int [][] c=new int[2][3];
		 int[][] a = { {2, 3, 4}, {5, 2, 3} };
	        int[][] b = { {4, 5, 3}, {5, 6, 3} };
	        for(int i=0;i<2;i++)
	        {
	        	for(int j=0;j<3;j++)
	        	{
	        		c[i][j]=a[i][j]+b[i][j];
	        	}
	        }
	        for(int i=0;i<2;i++)
	        {
	        	for(int j=0;j<3;j++)
	        	{
	        		System.out.print(c[i][j]+" ");
	        		
	        	}
	        	System.out.println();
	        }	
	}

}
