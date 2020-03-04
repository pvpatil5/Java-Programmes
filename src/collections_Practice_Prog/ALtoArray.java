package collections_Practice_Prog;
import java.util.ArrayList; 

public class ALtoArray 
{
	public static void main (String[] args) 
	{ 
		ArrayList al = new ArrayList(); 
		al.add(10); 
		al.add(20); 
		al.add(30); 
		al.add(40); 

		Object a2[] = al.toArray(); 
		for (Object obj : a2) 
			System.out.print(obj + " "); 
	} 
}
