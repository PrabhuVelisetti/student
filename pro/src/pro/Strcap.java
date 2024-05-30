package pro;

import java.util.Scanner;

public class Strcap {

	
	
	public static void rev()
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("enter first number");
		int a =ob.nextInt();
		System.out.println("enter second number");
		int b =ob.nextInt();
		int c;
		c=b;
		b=a;
		a=c;
		System.out.println("Value of a is " + a
                + " and Value of b is " + b);
		
				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	rev();
	}

}
