
public class Duplicate_Char_string {

	public static void main(String[] args)
	{
		String s1= "Character";
		int count=0;
		char c[]=s1.toCharArray();
		char c1[]=c;
		//	System.out.println(c[2]);
		for (int i = 0; i < c.length-1; i++) 
		{
			//int count = 0;
			for (int j = 0; j < c.length-1; j++) 
			{
				if (c[i]==c1[j]);
				count++;
				System.out.print(c[i]);

			}
		}
		if(count>1) 
		{
						
		}
		

	}

}
