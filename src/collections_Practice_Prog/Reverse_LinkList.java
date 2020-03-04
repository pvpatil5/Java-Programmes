package collections_Practice_Prog;

import java.util.Collections;
import java.util.LinkedList;

public class Reverse_LinkList {

	public static void main(String[] args)
	{
		LinkedList l1= new LinkedList();
		l1.add(12);
		l1.add(15);
		l1.add(79);
		l1.add("hi");
		System.out.println("Before Reversing="+l1);
		Collections.reverse(l1);
		System.out.println("After Reversing="+l1);
	}

}
