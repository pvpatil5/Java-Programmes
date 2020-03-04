import java.util.Scanner;

public class Occurences 
{

	public static void main(String[] args) 
	{

		String s= "hello everyone";
		char c[]=s.toCharArray();
		char t[]=c;

		for (int i = 0; i < c.length; i++) 
		{
			int count=1;
			for (int j = i+1; j < c.length-1; j++)
			{
				if (c[i]==c[j])	
				{
					count++;
					c[j]=0;
				}

			}
if(count>0 && c[i]!='0')
{
	System.out.println(c[i]+" "+count);	
}

		}
	}	

}
