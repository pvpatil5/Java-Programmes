package string_Practice_Prog;

public class Duplicate_Char_string
{
	public static void main(String[] args)
	{
		String s1= "character is important "; // convert to lower case

		char c[]=s1.toCharArray();
		int count;

		for (int i = 0; i < c.length; i++) 
		{
			count =1;
			for (int j = i+1; j < c.length; j++) 
			{
				if(c[i]==(c[j])) 
				{
					count++;  
					c[j] = '0';  
				}  
			}  
			if(count > 1 && c[i] != '0')  
				System.out.println(c[i]+" count is="+count );  
		}
	}
}