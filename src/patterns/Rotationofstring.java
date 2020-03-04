package patterns;

public class Rotationofstring 
{
	public static void main(String[] args) 
	{
		String s1="this is my computer";
		String s[]=s1.split(" ");
		for (int i = 0; i < s.length; i++) 
		{
			String a=s[i];
			for (int j = a.length()-1; j >=0; j--) 
			{
				System.out.print(a.charAt(j));
			}
			System.out.print(" ");
		}	
	}
}
