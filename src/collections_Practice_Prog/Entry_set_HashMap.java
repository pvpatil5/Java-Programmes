package collections_Practice_Prog;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Entry_set_HashMap {

	public static void main(String[] args)
	{
		HashMap<String, String> hm = new HashMap<String, String>();

		hm.put("first", "FIRST INSERTED");
		hm.put("second", "SECOND INSERTED");
		hm.put("third","THIRD INSERTED");

		System.out.println(hm);

		Set<Entry<String, String>> entires = hm.entrySet();
		for(Entry<String,String> ent:entires)
		{
			System.out.println(ent.getKey()+" ==> "+ent.getValue());
		}
	}
}
