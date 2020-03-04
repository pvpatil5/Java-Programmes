package collections_Practice_Prog;

import java.util.Collections;
import java.util.HashSet;

public class Set_Sync {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		
		hs.add("first");
		hs.add("second");
		hs.add("third");
		
		Collections.synchronizedSet(hs);
		System.out.println(hs);
	}

}
