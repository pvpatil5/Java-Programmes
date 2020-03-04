package collections_Practice_Prog;

import java.util.HashMap;

public class Map2HashMap {

	public static void main(String[] args) 
	{
		HashMap hm = new HashMap();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        HashMap subMap = new HashMap();
        subMap.put("s1", "S1 VALUE");
        subMap.put("s2", "S2 VALUE");
        hm.putAll(subMap);
        System.out.println(hm);
	}
}
