package pro;

import java.util.Scanner;

public class Mulfor {

	public static void main(Str[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int fn=sc.nextInt();
		System.out.println("Enter the last number");
		int ln=sc.nextInt();
		int p;
		for(int i=fn;i<=ln;i++)
		{
			for(int j=1;j<=10;j++)
			{
				p=i*j;
				System.out.println(i+"*"+j+"="+p);
			}
			System.out.println("");
		}
		
		

	}

}
