package pro;
interface king{
	void loan();
}
interface bank extends king {
	void roi();
	
	int display();
}
class sbi implements bank{
	public void roi() {
		System.out.println("the interest is 8%");
		}
	public void loan() {
		System.out.println("personal loan");

	}
    public int display() {
		
		return 5;
	}
}
class union implements bank{
	public void roi() {
		System.out.println("the interest is 7%");
		}

public void loan() {
	System.out.println("personal loan");

}
public int display() {
	
	return 6;
}
}
public class banks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank s=new sbi();
		bank u=new union();
		u.roi();
		u.loan();
		s.roi();
		s.loan();
		System.out.println("the number is "+ u.display());

	}

}
