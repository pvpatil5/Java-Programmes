package collections_Practice_Prog;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class Synchronisedlist {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		java.util.List a1= new ArrayList();
		 
		a1.add(10); 
		a1.add(15); 
		a1.add(30); 
		a1.add(20); 
		a1.add(5); 
           Collections.synchronizedList(a1);
           System.out.println(a1);

	}

}
