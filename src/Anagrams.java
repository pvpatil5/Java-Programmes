import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args)
	{
		String s1= "silent";
		String s2="list";

		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		boolean b= Arrays.equals(c1, c2);
		if(b)
		{
		System.out.println("Anagrams");	
		}
		else 
		{
			System.out.println("not Anagrams");
		}
	}

}
