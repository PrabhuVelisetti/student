package pro;

import java.util.Scanner;

public class student {
	int sid;
	String sname;
	int s1;
	int s2;
	int t;
	int a;
	void display()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter name");
		sname=sc.nextLine();
		
		System.out.println("enter id");
		sid=sc.nextInt();
		
		System.out.println("enter maths marks");
		s1=sc.nextInt();
		
		System.out.println("enter science marks");
		s2=sc.nextInt();
		
		t=s1+s2;
		a=t/2;


		



		
		
		System.out.println(sid);
		System.out.println(sname);
		System.out.println("total marks are "+t);
		System.out.println("average marks are "+a);


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s=new student();
		s.display();
		
		

	}

}
