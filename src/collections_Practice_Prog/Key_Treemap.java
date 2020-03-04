package collections_Practice_Prog;

import java.util.TreeMap;

public class Key_Treemap extends Object
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		TreeMap m= new TreeMap<>();
		m.put(1, 'a');
		m.put(2, 'b');
		m.put(3, 'c');
		System.out.println(m);
		System.out.println(m.keySet());
		System.out.println(m.entrySet());
		
	}
}
