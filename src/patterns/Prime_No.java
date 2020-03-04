package patterns;

public class Prime_No 
{
	public static void main(String[] args) 
	{
		//int a=11;

		for (int i = 1; i < 20; i++) 
		{
			int count =0;
			for (int j = 1; j <= i/2 ; j++) 
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count<=1)
			{
				System.out.println(i+" "+"no is prime");
			}
		}
	}
}
