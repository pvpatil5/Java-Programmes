package collections_Practice_Prog;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedSubMap_TreeMap1 {

	public static void main(String[] args) 
	{
		TreeMap tm= new TreeMap<>();
		tm.put(1,"Pavan");
		tm.put(2,"das");
		tm.put(3,"Nik");
		tm.put(4,"shri");
		tm.put(5,"akshay");

		System.out.println("Treemap are="+tm);

		SortedMap s=tm.subMap(2, 5);
		System.out.println(s);
	}

}
