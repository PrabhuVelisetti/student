package pro;

interface Inf1{
	   public void method1();
	}
	interface Inf2 extends Inf1 {
	   public void method2();
	}
	public class demo1 implements Inf2{
	  
	    public void method1(){
		System.out.println("method1");
	    }
	    public void method2(){
		System.out.println("method2");
	    }
	    public static void main(String args[]){
		Inf2 obj = new demo1();
		obj.method2();
	    }
	}
