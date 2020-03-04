package collections_Practice_Prog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Shuffling_in_AL {

	public static void main(String[] args)
	{ 
		ArrayList a1 = new ArrayList(); 
		a1.add("Selenium"); 
		a1.add("Manual"); 
		a1.add("java"); 
		a1.add("Phython"); 
		a1.add("SQL"); 
		a1.add("WebTech"); 

		System.out.println("Original List :" + a1); 
		Collections.shuffle(a1);
		//new Random(5));
		System.out.println("Shuffled List :" + a1); 
	} 
}

