package collections_Practice_Prog;
import java.util.*; 
public class ALContains_ListElements
{
	public static void main(String args[]) 
	{ 
		ArrayList a1 = new ArrayList(); 
		a1.add(10); 
		a1.add(15); 
		a1.add(30); 
		a1.add(20); 
		a1.add(5); 
		
		System.out.println(a1.size());

		System.out.println("List: " + a1); 

		ArrayList a2 = new ArrayList(); 

		a2.add(30); 
		a2.add(15); 
		a2.add(5); 

		System.out.println("Are all the contents equal= "
				+ a2.containsAll(a1)); 
	} 
}


