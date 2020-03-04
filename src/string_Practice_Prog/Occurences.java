package string_Practice_Prog;
public class Occurences 
{
	public static void main(String[] args) 
	/*{
		String s= "hello everyone";
		char c[]=s.toCharArray();
		int count;
		//char t[]=c;

		for (int i = 0; i < c.length; i++) 
		{
			count=1;
			for (int j = i+1; j < c.length-1; j++)
			{
				if (c[i]==c[j])	
				{
					count++;
					c[j]='0';
				}
			}
			if(count>=1 && c[i]!='0')
			{
				System.out.println(c[i]+" "+count);	
			}

		}
	}	

}*/
	{


		String string = "hello everyone";  
		int count;  
		//string = string.toLowerCase();  
		//String words[] = string.split(" "); 
		char []c=string.toCharArray();
		System.out.println("Duplicate words in a given string : ");   
		for(int i = 0; i < c.length; i++)
		{  
			count = 1;  
			for(int j = i+1; j < c.length; j++)
			{  
				if(c[i]==(c[j]))
				{  
					count++;  
					c[j] = '0';  
				}  
			}  
			if(count >= 1 && c[i] != '0')  
				System.out.println(c[i]+" count is="+count );  
		}
	}
}
