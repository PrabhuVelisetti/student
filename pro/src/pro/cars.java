package pro;
abstract class car1{
	public void drive() {
		
	}
	
	public  abstract void speed();
	
}
class wagnor extends car1{
	 public void speed() {
		System.out.println("wagnor");
	}
}
class bmw extends car1{
	public void speed() {
		System.out.println("bmw");
	}
}
public class cars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car1 w=new wagnor();
		car1 b=new bmw();
		w.speed();
		b.speed();


	}

}
