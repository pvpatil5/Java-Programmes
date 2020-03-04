import java.util.ArrayList;

public class ALtoArray {

	public static void main(String[] args)
	{
		ArrayList a1= new ArrayList<>();
		a1.add("a");
		a1.add("b");
		a1.add("c");
		a1.add("d");
		a1.add("e");
		System.out.println("Arraylist elements ="+a1);
		Object[] c =a1.toArray();
		System.out.println("Array elements are=");
		for (Object object : c)
		{
			System.out.print(" "+object);
		}
	}
}
