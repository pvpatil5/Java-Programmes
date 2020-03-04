package collections_Practice_Prog;

import java.util.TreeMap;

public class Reversrkey_TM {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TreeMap tm = new TreeMap<>();

		tm.put(1,"Pavan");
		tm.put(2,"das");
		tm.put(3,"Nik");
		tm.put(4,"shri");
		tm.put(5,"akshay");

		System.out.println(tm.descendingKeySet());
		System.out.println(tm.descendingMap()); 
		



	}

}
