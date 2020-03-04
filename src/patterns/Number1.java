package patterns;

public class Number1 {

	public static void main(String[] args)
	{
		int count=0;
		for (int i = 0; i <=4; i++) 
		{
			count=count+i;
			for (int j = 3; j >=i; j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) 
			{
				System.out.print(count+"");
				count--;
			}
			System.out.println();
			count=count+i;
		}

	}
}
