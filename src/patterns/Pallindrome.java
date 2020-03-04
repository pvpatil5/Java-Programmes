package patterns;

public class Pallindrome {

	public static void main(String[] args) 
	{
		String s1= "oppo";
		char c1[]=s1.toCharArray();
		String s2="";
		for (int i = c1.length-1; i >= 0; i--) 
		{
			s2=s2+c1[i];
		}
		System.out.println("Reversed String is="+s2);
		if(s1.equals(s2)) 
		{
			System.out.println("pallindrome");
		}
		else 
		{
			System.out.println("not pallindrome");
		}
	}
}
