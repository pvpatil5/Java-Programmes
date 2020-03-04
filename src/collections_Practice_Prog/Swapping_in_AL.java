package collections_Practice_Prog;

import java.util.ArrayList;
import java.util.Collections;

public class Swapping_in_AL {

	public static void main(String[] args) 
	{ 
		{ 
			ArrayList mylist = new ArrayList(); 
			mylist.add("code"); 
			mylist.add("practice"); 
			mylist.add("quiz"); 
			mylist.add("Selenium"); 

			System.out.println("Original List : \n" + mylist); 
			Collections.swap(mylist, 1, 2); 

			System.out.println("\nAfter swap(mylist, 1, 2) : \n"+ mylist); 
			Collections.swap(mylist, 3, 1); 

			System.out.println("\nAfter swap(mylist, 3, 1) : \n"+ mylist); 
		} 
	} 
}

