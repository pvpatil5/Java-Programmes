package patterns;

public class StarPyramid 
{

	public static void main(String[] args) 
	{
		int line =4;
		int starcount=1;
		int spacecount=3;
		for (int i = 0; i < line; i++) 
		{
			for (int j = 0; j <spacecount ; j++) 
			{
				System.out.print(" ");
			}
			for (int j = 0; j < starcount; j++) 
			{
				System.out.print(" *");
			}
			System.out.println();
			spacecount--;
			starcount++;
		}
	}
}
