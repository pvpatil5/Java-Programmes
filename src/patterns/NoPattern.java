package patterns;

public class NoPattern {

	public static void main(String[] args) 
	{

		int lines =5;
		for (int i = 1; i <= lines; i++)
		{
			{
				for (int j = 1; j <=i; j++) 
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}

		}
		System.out.println("==================");
		for (int i = 1; i <= lines; i++)
		{
			{
				for (int j = 1; j <=i; j++) 
				{
					System.out.print(i+" ");
				}
				System.out.println();
			}
		}
		System.out.println("==================");
		for (int i = 1; i <= lines; i++)
		{
			{
				for (int j = 1; j <=i; j++) 
				{
					System.out.print("1"+" ");
				}
				System.out.println();
			}
		}
		System.out.println("==================");
		for (int i = 1; i <= lines; i++)
		{
			{
				for (int j = 1; j <=i; j++) 
				{
					System.out.print(j+" ");		
				}
				System.out.println();
			}
		}
		for (int i = lines; i >= 1; i--) 
		{
			for (int j = 1; j <=i; j++) 
			{
				System.out.print(j+" ");
			}	
			System.out.println();
		}
		System.out.println("==================");
		for (int i = 1; i <= lines; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = lines; i >= 1; i--)
		{
			for (int j = 1; j < i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("===========");
		for (int i = 1; i <= lines; i++)
		{
			for (int j = lines; j > i; j--)
			{
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++)
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}
		for (int i = 1; i <= lines; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= lines - i; k++)
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}
		System.out.println("=================");
	}
}
