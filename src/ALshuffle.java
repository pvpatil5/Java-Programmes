import java.util.ArrayList;
import java.util.Collections;

public class ALshuffle {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList a1= new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		System.out.println("Before Shuffling="+a1);
		Collections.shuffle(a1);
		System.out.println("After Shuffling="+a1);	
	}
}
