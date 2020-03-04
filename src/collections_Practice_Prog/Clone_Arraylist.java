package collections_Practice_Prog;

import java.util.ArrayList;

public class Clone_Arraylist {

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		a1.add(6);
		ArrayList a2= (ArrayList) a1.clone();
		System.out.println("Original ArrayList="+a1);
		System.out.println("Copied ArrayList="+a2);
	}

}
