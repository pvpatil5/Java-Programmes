package arrays_practice_prog;

public class MaxValue_1st_half {

	public static void main(String[] args) 
	{
		int a[] = {5,10,4,2,3,4,5};

		int max=a[0];

		for(int i = 0; i < a.length/2; i++)
		{
			if(a[i]>max) 
			{
				max=a[i];
			}
		}
		System.out.println(max);

	}
}

