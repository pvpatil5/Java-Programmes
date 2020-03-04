package collections_Practice_Prog;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Fst_LinkList {

	public static void main(String[] args) 
	{
		LinkedList l1=new LinkedList();
		l1.add(5);
		l1.add(6);
		l1.add(8);
		l1.add(9);
		l1.add(3);
		
		Iterator it = l1.iterator();	
		while (it.hasNext()) 
		{
		//	Object object = (Object) it.next();
			System.out.println(it.next());
			
		}
		
 		System.out.println(l1.get(0));
		System.out.println("first element is="+l1.getFirst());
	}

}
