package arrays_practice_prog;

public class Sum_2nd_Half {

	public static void main(String[] args) 
	{

		int sum = 0;

		int a[] = {1,2,3,4,5,6};


		for(int i = a.length/2; i < a.length; i++)
		{

			sum = sum + a[i];
		}
		System.out.println("Sum:"+sum);

	}


	}


