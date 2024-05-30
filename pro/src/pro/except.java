package pro;

public class except {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int array[] = new int[10];
			array[10] = 30;
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			}
	}

}
