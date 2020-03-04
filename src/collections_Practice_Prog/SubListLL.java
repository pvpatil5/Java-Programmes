package collections_Practice_Prog;

import java.util.LinkedList;

public class SubListLL {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LinkedList l1=new LinkedList();
		l1.add(5);
		l1.add(6);
		l1.add(8);
		l1.add(9);
		l1.add(109);
		l1.add(104);
		l1.add(102);
		System.out.println(l1.subList(2, 5));
	}
}
