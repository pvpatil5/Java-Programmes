package collections_Practice_Prog;

import java.util.HashMap;

public class Search_Value_HashMap {

	public static void main(String[] args)
	{
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("first", "FIRST INSERTED");
		hm.put("second", "SECOND INSERTED");
		hm.put("third","THIRD INSERTED");
		System.out.println(hm);
		
		if(hm.containsValue("First Inserted"))
		{
			System.out.println("The hashmap contains Value first");
		} else {
			System.out.println("The hashmap does not contains Value first");
		}
		if(hm.containsValue("THIRD INSERTED"))
		{
			System.out.println("The hashmap contains Value THIRD");
		} else {
			System.out.println("The hashmap does not contains Value THIRD");
		}

	}

}
