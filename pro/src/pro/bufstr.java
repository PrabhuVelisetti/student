package pro;

public class bufstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String d="Swathi";
		d=d+" Prabhu";
		System.out.println(d);

		StringBuffer s=new StringBuffer("Prabhu");
		System.out.println(s.capacity());
		System.out.println(s.length());
		
		System.out.println(s);

		System.out.println(s.append(" Velisetti"));
		s.insert(0, "The ");
		System.out.println(s);
		s.deleteCharAt(3);
		System.out.println(s);
		s.setLength(30);
		System.out.println(s.length());
		s.ensureCapacity(50);
		System.out.println(s.capacity());
		System.out.println(System.identityHashCode(s));

		




		


		

	}

}
