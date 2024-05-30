package pro;

public class overload {
	int sum(int a,int b) {
		return a+b;
	}
	int sum(int a,int b,int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overload o=new overload();
		/*  int d=o.sum(10, 20);
		int e=o.sum(10,20, 30);
		System.out.println(d);
		System.out.println(e);   */
		System.out.println(o.sum(55, 10));
	    System.out.println(o.sum(55, 10,20));


	}

}
