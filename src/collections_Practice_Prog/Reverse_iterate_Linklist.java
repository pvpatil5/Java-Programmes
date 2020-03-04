package collections_Practice_Prog;

import java.util.Iterator;
import java.util.LinkedList;


public class Reverse_iterate_Linklist {

	public static void main(String[] args) 
	{
		LinkedList l1=new LinkedList();
		l1.add(5);
		l1.add(6);
		l1.add(8);
		l1.add(9);

		System.out.println(l1);

		Iterator it=l1.descendingIterator();
		{
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
	}
}