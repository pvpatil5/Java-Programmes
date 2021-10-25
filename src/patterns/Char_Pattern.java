package patterns;

public class Char_Pattern {

	public static void main(String[] args)
	{
	
		char c ='A';
		int lines = 4;
		int spacecount = 3;
		int charcount=1;
		
		for (int i = 0; i < lines; i++) 
		{
			for (int j = 0; j < spacecount; j++) 
			{
				System.out.print(" ");
			}
			for (int j = 0; j < charcount ; j++) 
			{
				System.out.print(c);
			}
			spacecount--;
			charcount++;
			c++;
			System.out.println();
		}

	}
}


