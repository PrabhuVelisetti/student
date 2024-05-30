package pro;

import java.util.Scanner;

public class avgmarks {
    public static void avgm()
    {
    	Scanner ob=new Scanner(System.in);
		System.out.println("enter eng marks");
		int a =ob.nextInt();
		System.out.println("enter maths marks");
		int b =ob.nextInt();
		System.out.println("enter science marks");
		int c =ob.nextInt();
		int avg=(a+b+c)/3;
		System.out.println("the avg is "+avg);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		avgm();
	}

}
