package pro;
class employee{
	float sal=50000;
}
public class Progarmmer extends employee {
	int bonus=10000;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Progarmmer p=new Progarmmer();
		System.out.println("programmer sal " +p.sal);
		System.out.println("programmer bonus " +p.bonus);

		

	}

}
