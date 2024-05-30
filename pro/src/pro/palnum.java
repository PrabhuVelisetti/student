package pro;

import java.util.Scanner;

public class palnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,s=0,r,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		n=sc.nextInt();
		t=n;
		while(n>0)
		{
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if(t==s)
		{
			System.out.println("number is pal");
			
		}
		else
			System.out.println("number is not pal");


	}

}
