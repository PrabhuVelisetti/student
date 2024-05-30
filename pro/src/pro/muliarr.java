package pro;

import java.util.Scanner;

public class muliarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int c[][]=new int[2][2];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first martix");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
		}
		
		System.out.println("enter second martix");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				b[i][j]=sc.nextInt();
				
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				c[i][j]=0;
				for(int k=0;k<2;k++)
				{
					
					 c[i][j]= c[i][j]+ a[i][k]*b[k][j];
					
					
				}
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				
					System.out.print(c[i][j]+" ");
					
			}
			System.out.println();
			
		}
		

	}

}
