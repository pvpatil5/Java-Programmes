package pac;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set {

	public static void main(String[] args) 
	{
				String s1="apple";
				char arr[]	=s1.toCharArray();
				LinkedHashSet hs= new LinkedHashSet<>();  
		
				for (int i = 0; i < arr.length; i++) 
				{
					hs.add(arr[i]);
				}
				System.out.println(hs);
				
				Iterator it = hs.iterator();
				
				while(it.hasNext()) 
				{
					System.out.print(it.next());
				}
				System.out.println();
				System.out.println("=========");

		int a= 0;
		int b=1;
		int sum=0;
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i < 20; i++)
		{
			sum= a+b;
			a=b;
			b=sum;
			System.out.println(sum);
		}
	}
}
