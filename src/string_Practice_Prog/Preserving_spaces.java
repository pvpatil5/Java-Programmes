package string_Practice_Prog;

public class Preserving_spaces {

	public static void main(String[] args) 
	{
		String s1="abc de";
		char c[]=s1.toCharArray();
		char temp[]=new char[c.length];
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]==' ') 
			{
				temp[i]=c[i];
			}
		}
		int j= temp.length-1;
		for (int i = 0; i < temp.length-1; i++) 
		{
			if(c[i]!=' ') 
			{
				if(temp[j]==' ')
				{
					j--;
				}
				temp[j]=c[i];
				j--;
			}
			System.out.println(String.valueOf(temp[j]));	
		}
	}
}
