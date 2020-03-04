package collection_Pac;

import java.util.ArrayList;
import java.util.Iterator;

public class Fibonnaci_and_Prime {

	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int sum;
		int count=0;
		System.out.println(a);
		System.out.println(b);
		ArrayList<Integer> a1= new ArrayList<>();

		for (int i = 0; i < 100; i++) 
		{
			sum= a+b;
			a1.add(sum);
			a=b;
			b=sum;
		}

		Iterator<Integer> i= a1.iterator();
		while(i.hasNext()) 
		{
			int n= i.next();
			for (int j = 1; j <= a1.size(); j++) 
			{
				
				if(n%j==0)
				{
					count++;
				}
				if (count==2) 
				{
					
					System.out.println(n +" " +"prime");
				}
				else 
				{
					System.out.println("not prime");

				}
			}

		}
	}

}


//		int a= 59;		
//for (int j = 1; j <= sum; j++) 
//{
//	if(a%j==0) 
//	{
//		count++;
//	}
//}
//if (count==2) {
//	System.out.println("prime");
//}
//else {
//	System.out.println("not prime");
