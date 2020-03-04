import java.util.ArrayList;

public class ALcontainsAll {

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		ArrayList a2=new ArrayList();
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		a1.add(6);
		
		a2.add(11);
		a2.add(12);
		a2.add("a");
		System.out.println(a1.containsAll(a2));
	}

}
