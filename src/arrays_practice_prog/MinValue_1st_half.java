package arrays_practice_prog;

public class MinValue_1st_half {

	public static void main(String[] args) 
	{


		int a[] = {5,10,4,2,3,4,5};

		int min=a[0];

		for(int i = 0; i < a.length/2; i++)
		{
			if(a[i]<min) 
			{
				min=a[i];
			}
		}
		System.out.println(min);

	}


}


