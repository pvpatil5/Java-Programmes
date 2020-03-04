package arrays_practice_prog;

public class MinValue_2nd_haif {

	public static void main(String[] args) 
	{
		int a[] = {1,10,4,3,4,2};

		int min=a[a.length/2];

		for(int i = a.length/2; i < a.length; i++)
		{
			if(a[i]<min) 
			{
				min=a[i];
			}
		}
		System.out.println(min);

	}
}


