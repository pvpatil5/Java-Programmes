package arrays_practice_prog;

public class Sum_1st_half {

	public static void main(String[] args)
	{
		int sum = 0;

		int a[] = {1,2,3,4,5,7};


		for(int i = 0; i < a.length/2; i++)
		{

			sum = sum + a[i];
		}
		System.out.println("Sum:"+sum);

	}


}


