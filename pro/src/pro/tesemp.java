package pro;
class emp{
	int en;
	String ename;
	void insert(int n,String s ) {
		en=n;
		ename=s;

		
	}
	void display() {
		
		System.out.println(en);
		System.out.println(ename);
	}
}
public class tesemp {

	public static void main(String[] args) {
		emp e=new emp();
		e.insert(101,"prabhu");
		e.display();
		
		

	}

}
