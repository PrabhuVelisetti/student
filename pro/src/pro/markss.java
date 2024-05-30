package pro;



import java.util.Scanner;
public class markss {
	int s1;
	int s2;
	int s3;
	int n1;
	float tot,avg;
	void display()
	{
	 Scanner sc=new Scanner(System.in);
	 s1=sc.nextInt();
	 s2=sc.nextInt();
	 s3=sc.nextInt();
	 n1=sc.nextInt();
	 tot=s1+s2+s3;
	 avg=(tot)/n1;
	 System.out.println(tot);
	 System.out.println(avg);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		markss s =new markss();
		s.display();
	}
}