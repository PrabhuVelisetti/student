package pro;
interface one{
	void method1();
}
interface two{
	void method2();
}
public class normal implements one,two {
	public void method1() {
		System.out.println("method1 is called");
	}
	public void method2() {
		System.out.println("method2 is called");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		normal n=new normal();
		n.method1();
		n.method2();
		

	}

}
