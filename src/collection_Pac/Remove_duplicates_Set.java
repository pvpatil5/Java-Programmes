package collection_Pac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Remove_duplicates_Set {

	public static void main(String[] args) 
	{
		String s1="PAVANA";
		char c[] =s1.toCharArray();

		HashSet s = new HashSet();	

		for (int i = 0; i < c.length; i++) 
		{
			s.add(c[i])	;
		}
		System.out.println(s);

	}

}
