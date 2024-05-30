package pro;

import java.util.Scanner;

public class For {

	public static void main(Str[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("enter  num");
		int num=ob.nextInt();
		int p;
		for(int i=1;i<=5;i++)
		{
			p=num*i;
			System.out.println(num+ "*" +i+ "="  +p);

		}

	}

}
