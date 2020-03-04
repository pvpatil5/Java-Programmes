package string_Practice_Prog;

public class Reverse_string
{

	public static void main(String[] args)
	{
		String s= "Pavan";
		System.out.println("Given string is "+s);
		char c[]=s.toCharArray();
		for (int i = c.length-1; i >= 0; i--) 
		{
			System.out.print (c[i]);

		}


	}

}
