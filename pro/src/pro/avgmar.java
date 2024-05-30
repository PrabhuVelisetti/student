package pro;

public class avgmar {
	int  a,b,c,d;
	public avgmar(int engmarks,int mathmarks) {
		a=engmarks;
		b=mathmarks;
		 d=a+b;
		c=(a+b)/2;
		System.out.println("average is "+c);
		System.out.println("total is "+d);
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		avgmar obj =new avgmar(10,20);
		System.out.println("average is "+obj.c);
		System.out.println("total is "+obj.d);
		

	}

}
