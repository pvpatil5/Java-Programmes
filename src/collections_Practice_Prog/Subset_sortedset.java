package collections_Practice_Prog;

import java.util.SortedSet;
import java.util.TreeSet;

public class Subset_sortedset {

	public static void main(String[] args) 
	{
		SortedSet s=new TreeSet<>();
		s.add(6);
		s.add(8);
		s.add(9);
		s.add(5);
	System.out.println("Subset from 1to 6 are="+s.subSet(1, 3));	

	}

}
