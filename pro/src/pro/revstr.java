package pro;

import java.util.Scanner;

public class revstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stubn
		
		Scanner ob=new Scanner(System.in);
		System.out.println("enter name");
		String s=ob.nextLine();
		String r="";
		for(int i=0;i<s.length();i++)
		{
			r=s.charAt(i)+r;
		}
		System.out.println(r);
		if(s.equals(r))
			System.out.println( s+ " is pal");
		else
			System.out.println(s+" is not pal");
			
		

	}

}
