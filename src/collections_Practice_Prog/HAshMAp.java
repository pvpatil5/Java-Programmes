package collections_Practice_Prog;

import java.util.HashMap;
import java.util.Map;

public class HAshMAp {

	public static void main(String[] args)
	{
	HashMap<Integer, String> hs = new HashMap<Integer, String>();
	hs.put(1, "Apple");
	hs.put(2, "Mango");
	hs.put(3, "pineapple");
	hs.put(4, "banana");
	
	System.out.println(hs);
	
	for(Map.Entry m1: hs.entrySet()) 
	{
	System.out.println(m1.getKey()+" "+m1.getValue());	
	}
	//Diffrent method
	
	System.out.println(hs.containsKey(5));
	System.out.println(hs.containsValue("Mango"));
	System.out.println(hs.get(3));
	
	boolean b=hs.isEmpty();
	System.out.println(b);
	
	}

	
}
