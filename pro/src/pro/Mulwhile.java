package pro;

import java.util.Scanner;

public class Mulwhile {

	public static void main(Str[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int fn=sc.nextInt();
		System.out.println("Enter the last number");
		int ln=sc.nextInt();
		int p;
		
		while(fn<=ln)
		{
			int j=1;
			while(j<=10)
			{
				p=fn*j;
				System.out.println(fn+"*"+j+"="+p);
				j=j+1;
			}
			fn=fn+1;
			System.out.println(" ");
			
		}
		

	}

}
