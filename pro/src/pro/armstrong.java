package pro;

public class armstrong {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;
		int t,r;
		double res=0;
		t=n;
		while(n!=0)
		{
			r=n%10;
			res=res+Math.pow(r, 3);
			n=n/10;
		}
		if(t==res) 
			System.out.println("armstrong");
		else
			System.out.println("not an armstrong");
		

	}

}
