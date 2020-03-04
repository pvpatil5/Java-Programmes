package collections_Practice_Prog;

import java.util.ArrayList;

public class Remove_Duplicates {

	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList<>();
		a.add(5);
		a.add(6);
		a.add(8);
		a.add(6);
		a.add(8);
		System.out.println(a);

		for (int i = 0; i < a.size(); i++) 
		{
			for (int j = i+1; j < a.size(); j++) 
			{
				if(a.get(i)==a.get(j))
				{
					a.remove(j);
				}
			}
		}

		System.out.println(a);
	}

}
