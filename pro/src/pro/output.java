package pro;
import java.io.FileOutputStream;

public class output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream a= new FileOutputStream("D://prabhu.txt");
			a.write( 67);
			
			System.out.println("done");
			
		}
		catch(Exception e) {
			System.out.print(e);
		}

	}

}
