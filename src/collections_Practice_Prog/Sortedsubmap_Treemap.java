package collections_Practice_Prog;

import java.util.TreeMap;

public class Sortedsubmap_Treemap {

	public static void main(String[] args) 
	{
		TreeMap m= new TreeMap<>();
		m.put(1, 'a');
		m.put(2, 'b');
		m.put(3, 'c');
		m.put(4, 'd');
		m.put(5, 'e');
		m.put(6, 'f');
		m.put(7, 'g');
		m.put(8, 'l');
		System.out.println(m);
		System.out.println(m.subMap(2, 5));	


	}

}
