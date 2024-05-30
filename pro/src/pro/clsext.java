package pro;

class e{
	int c=55;
}
class ex extends e{
	int a=5+c;
}
class exx extends ex{
	int b=a+44+c;
}
public class clsext {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exx obb=new exx();
		System.out.println(obb.a);
		System.out.println(obb.b);
		System.out.print(obb.c);


	}

}
