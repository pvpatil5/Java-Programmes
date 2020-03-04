import java.text.spi.DateFormatProvider;
import java.util.ArrayList;
import java.util.Date;

public class ALclone {

	public static void main(String[] args) 
	{
	ArrayList a1 = new ArrayList<>();
	a1.add(10);
	a1.add(20);
	a1.add(30);
	a1.add(40);
	System.out.println(a1);
	ArrayList a2= (ArrayList) a1.clone();
	System.out.println(a2);
	a1.add(50);
	System.out.println(a1);
		
	}

}
