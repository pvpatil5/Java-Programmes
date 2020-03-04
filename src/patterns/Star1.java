package patterns;

public class Star1 {

	public static void main(String[] args) 
	{
		/*int line =4;
		int starcount=1;
		for (int i = 0; i < line; i++) 
		{
			for (int j = 0; j < starcount; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
			starcount++;
		}*/
		System.out.println("=================");

		int line =4;
		int starcount=4;
		int spacecount=0;
		for (int i = 0; i < line; i++) 
		{
			for (int k = 0; k <= spacecount; k++) 
			{
				System.out.print(" ");
			}
			for (int j = 0; j < starcount; j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
			starcount--;
			spacecount++;
		}
	}
}
