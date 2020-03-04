
public class Recursive_String 
{

	public static void main(String[] args) 
	{
		String s= "Test Yantra";
		String rs= reverseString(s);
		System.out.println(rs);
	}

	public static String reverseString(String s)

	{
		if(s.isEmpty()) 
			return s;	

		else 
		{
			return reverseString(s.substring(1))+s.charAt(0);

		}
	}

}
