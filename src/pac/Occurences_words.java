package pac;

public class Occurences_words {

	public static void main(String[] args)
	{
		int count;
		String s1= "my country is my mom and i love my mom";
		String str[]=s1.split(" ");
		//System.out.println(str[5]);

		for (int i = 0; i < str.length; i++) 
		{
			count=1;
			for (int j = i+1; j < str.length; j++) 
			{

				if (str[i].equals(str[j])) 
				{
					count++;
					str[j]="0";
				}
			}
			if(str[i]!="0" && count>=1)
			{
				System.out.println(str[i]+" count is "+count);
			}
		}
	}
}
