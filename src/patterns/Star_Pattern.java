package patterns;

public class Star_Pattern {

	public static void main(String[] args) 
	{
	
		int spacecount=6;
		int lines=4;
		int starcount = 1;
		for (int i = 0; i <lines; i++) 
		{
			for (int j = 0; j < spacecount; j++) 
			{
				System.out.print(" ");
			}
			for (int j = 0; j < starcount; j++) 
			{
				System.out.print("* ");
			}
			spacecount = spacecount-2;
			starcount = starcount+2;
			System.out.println();
		}
		
				

	}

}
