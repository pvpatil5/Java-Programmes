package collections_Practice_Prog;

import java.util.HashMap;
import java.util.Set;

public class Get_All_keys {

	public static void main(String[] args)
	{
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("first", "FIRST INSERTED");
		hm.put("second", "SECOND INSERTED");
		hm.put("third","THIRD INSERTED");
		System.out.println(hm);
		
		Set<String> keys = hm.keySet();
		for(String key: keys)
		{
			System.out.println(key);

		}
	}
}