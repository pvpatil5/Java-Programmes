package collections_Practice_Prog;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class SubList_LinkList {

	public static void main(String[] args)
	{
		LinkedList l1=new LinkedList();
		l1.add(6);
		l1.add(8);
		l1.add(7);
		l1.add(3);
		l1.add(2);
		l1.add(3);
		System.out.println(l1);
		/*	System.out.println(l1.subList(1, 5));
		Collections.reverse(l1);
		System.out.println(l1);*/
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		Iterator it=l1.descendingIterator();
		{
			while(it.hasNext()) {
				System.out.print(it.next());
			}
		}

	}
}
