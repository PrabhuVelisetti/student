package pro;
enum studentss{
	prabhu(21),swathi(20),sindhu(22);
	private int age;
	int getage() {
		return age;
		
	}
	private studentss(int age) {
		this.age=age;
	}
}

public class enumtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentss s;
		s=studentss.sindhu;
		System.out.println(studentss.prabhu.getage());
		System.out.println(s.getage());


	}

}
