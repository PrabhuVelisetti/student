package pro;

class stu
{
	int num;
	String sname;
	void insert(int n,String sn) {
		num=n;
		sname=sn;
	}
	void display() {
		System.out.println(num);
		System.out.println(sname);
	}
	
}
public class tesstu {

	public static void main(String[] args) {
	stu s=new stu();
	s.insert(1,"prabhu");
	s.display();
	}

}
