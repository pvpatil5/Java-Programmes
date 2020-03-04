package collections_Practice_Prog;

import java.util.Map;
import java.util.TreeMap;

public class Map_to_TreeMap {

	public static void main(String[] args) 
	{
		Map m= new TreeMap<>();
		TreeMap t= new TreeMap<>();
		m.put(1, 'a');
		m.put(2, 'b');
		m.put(3, 'c');
		System.out.println(m);
		t.putAll(m);
		System.out.println(t);
	}

}
