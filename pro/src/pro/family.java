package pro;
abstract class father{
	public abstract void display();
}
class son extends father{
	public void display() {
		System.out.println("prabhu");
	}
}
  class daughter extends father{
	 public  void display() {
			System.out.println("swapna");

	  }
  }


public class family {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		father a=new son();
		father b=new daughter();
		a.display();
		b.display();

	}

}
