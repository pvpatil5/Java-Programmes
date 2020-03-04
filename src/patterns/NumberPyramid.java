package patterns;

public class NumberPyramid 
{
	public static void main(String[] args) 
	{
		int line =4;
		int nocount=1;
		int spacecount=3;
		int count=0;
		for (int i = 1; i <= line; i++) 
		{

			for (int j = 1; j <=spacecount ; j++) 
			{
				System.out.print(" ");
			}
			count=count+i;
			for (int j = 1; j <= count; j++) 
			{
				System.out.print(count);

				count--;
			}
			count=count+i;
			System.out.println();
			nocount++;
			spacecount--;
		}

	}
}
