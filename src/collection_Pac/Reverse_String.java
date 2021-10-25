package collection_Pac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse_String {

	public static void main(String[] args) 
	{
		String s1="PAVANA";

		List l= new ArrayList();

		char c[] =s1.toCharArray();

		for (int i = 0; i < c.length; i++) 
		{
			l.add(c[i]);
		}
		Collections.reverse(l);
		System.out.println(l);	
	}

}
