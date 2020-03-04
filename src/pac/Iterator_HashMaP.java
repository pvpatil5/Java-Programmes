package pac;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Iterator_HashMaP {

	public static void main(String[] args) 
	{
		System.out.println("HashMap insersation order not maintained ");
	HashMap<Integer,String> hs= new HashMap<>();
		hs.put(1, "c");
		hs.put(3, "a");
		hs.put(5, "b");
		hs.put(2, "d");
		
		for(Map.Entry m : hs.entrySet())
		{    
		       System.out.println(m.getKey()+" "+m.getValue());     

		}
		System.out.println("Linked hash map-- Insersation order maintained");
		
		LinkedHashMap<Integer,String> lhm= new LinkedHashMap<>();
		lhm.put(1, "c");
		lhm.put(7, "a");
		lhm.put(3, "b");
		lhm.put(4, "d");
				
		for(Map.Entry m : lhm.entrySet())
		{    
		       System.out.println(m.getKey()+" "+m.getValue());     

		}

		System.out.println("Tree MAp---Natural sorting takes place");
		
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(1, "Pa");
		tm.put(1, "Pk");
		tm.put(5, "PP");
		tm.put(3, "PP");
		
		for(Map.Entry m: tm.entrySet()) 
		{
			 System.out.println(m.getKey()+" "+m.getValue());     
		}
		
		
	}
}
