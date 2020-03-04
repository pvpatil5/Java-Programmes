package collections_Practice_Prog;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Sync_map {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Map m= new TreeMap<>();

		m.put(1, 'a');
		m.put(2, 'b');
		m.put(3, 'c');
		System.out.println(m);
		Collections.synchronizedMap(m);
		System.out.println(m);
	}

}
