package pro;
import java.util.*;
public class strrev {
	 public static void main(String args[])
	   {
		 String s,r="";
			Scanner ob=new Scanner(System.in);
			System.out.println("enter name");
			s=ob.nextLine();;
	      for (int i=0;i<s.length();i++ )
	         r =  s.charAt(i) + r;
	      System.out.println(r);
	      if (s.equals(r))
	         System.out.println(s+" is a palindrome");
	      else
	         System.out.println(s+" is not a palindrome");
	}
}
