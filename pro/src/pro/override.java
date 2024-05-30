package pro;
class ride{
	void run() {
		System.out.println("prabhu");
	}
}

public class override extends ride {
	void run() {
		System.out.println("velisetti");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ride r=new ride();
		r.run();
		override o=new override();
		o.run();
		

	}

}
