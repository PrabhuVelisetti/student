package pro;

import java.util.ArrayList;
import java.util.Arrays;

public class Str {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String[] fruits= new String[] {"apple","orange","banana"};
		String find="apple";
		int f=0;
		for(int i=0;i<fruits.length;i++)
		{
			if(fruits[i]==find)
			{
				
			  System.out.println("it is there");
			  f=1;
			}
			
		}
		if(f==0)
		{
			System.out.println("not there");
		}
		

	}

}
