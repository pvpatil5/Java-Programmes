package patterns;

public class Square {

	public static void main(String[] args) 
	{
		int lines=5;
		int starcount= 5;
		for (int i = 1; i <= 4; i++) 
		{
			for (int j = 1; j <= 4; j++) 
			{
			//if(i>=2 && j>=2 && i<=4 && j<=4) 
				if(i==1 || j==1 || i==4 || j==4)
			{
				System.out.print("*");
			}
			else
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
