package string_Practice_Prog;

public class Pallindrome_in_sent {

	public static void main(String[] args)
	{
		String s1= "Madam Arora Teaches Malayalam";
		String str[]=s1.toLowerCase().split(" ");
		//String temp=" ";
		int count=0;
		for (int i = 0; i < str.length; i++) 
		{
			String temp=" ";
			char c[]=str[i].toCharArray();

			for (int j = c.length-1; j >=0; j--) 
			{
				temp=temp+c[j];

			}
				if (str[i].equals(temp)) 
				{
					count++;
					System.out.println(temp+count);
				}
				//System.out.println(temp+count);
			
		}
		//System.out.println(count);

	}

}
