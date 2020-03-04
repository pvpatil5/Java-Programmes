package string_Practice_Prog;

public class Pallindrome 
{

	public static void main(String[] args)
	{
		String s= "mommommom";
		char c[]=s.toCharArray();
		String p="";
		for (int i = c.length-1; i>=0; i--) 
		{
			p=p+c[i];

		}
		System.out.println(p);
		if (p.equals(s)) {
			System.out.println("Pallindrome");
		}
		else
		{
		System.out.println("Not Pallindrome");	
		}
	}

}
