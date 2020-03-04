package collections_Practice_Prog;

import java.util.LinkedList;

public class Linkedlist_Array {

	public static void main(String[] args)
	{
		LinkedList l1=new LinkedList();
		l1.add(5);
		l1.add(6);
		l1.add(8);
		l1.add(9);
		
		Object a2[] = l1.toArray(); 
		for (Object obj : a2) 
			System.out.print(obj + " "); 
		
	}

}
