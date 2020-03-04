import java.util.ArrayList;
import java.util.Collections;

public class ALswapping {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		{
			// TODO Auto-generated method stub
			ArrayList a1= new ArrayList<>();
			a1.add(10);
			a1.add(20);
			a1.add(30);
			a1.add(40);
			System.out.println("Before Swapping="+a1);
			Collections.swap(a1, 0, 3);
			System.out.println("After Swapping="+a1);

		}

	}
}