import java.util.ArrayList;
import java.util.LinkedList;

public class AlLtoLL {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ArrayList a1= new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		LinkedList ll = new LinkedList(a1);
		//LinkedList ll = new LinkedList<>();
		//ArrayList<> a2= new ArrayList<>(ll);
		System.out.println(ll);
	}
}
