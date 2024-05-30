package pro;

import java.util.Scanner;

public class sarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int find=0;
		Scanner ob=new Scanner(System.in);
		System.out.println("enter no of elements");
		int n=ob.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			 a[i]=ob.nextInt();
		}
		System.out.println("enter number");
		int f=ob.nextInt();
		for(int i=0;i<n;i++)
		{
			if(f==a[i])
			{
				find=1;
			System.out.print(a[i]+" is at the index "+i);
			}
			
		}
		if(find==0)
		{
				System.out.println("not there");
		}
			
	}

}
