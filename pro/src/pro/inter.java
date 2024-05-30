package pro;


interface printables{
    void print();
}

public class inter implements printables {
	public void print() {
		
		System.out.println("prabhu");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inter i=new inter();
		i.print();

	}

}
