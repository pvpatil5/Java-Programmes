package arrays_practice_prog;

public class MaxValue_2nd_half {

	public static void main(String[] args) 
	{
		int a[] = {5,10,4,2,3,8,5};

		int max=a[0];

		for(int i = a.length/2; i < a.length; i++)
		{
			if(a[i]>max) 
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}
}
