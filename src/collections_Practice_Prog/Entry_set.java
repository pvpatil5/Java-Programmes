package collections_Practice_Prog;

import java.util.TreeMap;

public class Entry_set {

	public static void main(String[] args)
	{
		TreeMap m= new TreeMap<>();
		m.put(1, 'a');
		m.put(2, 'b');
		m.put(3, 'c');
		System.out.println(m);
		m.put(4, 'j');
		System.out.println(m.entrySet());


	}

}
