package arrays_practice_prog;

public class AvgValue_1st_Half {

	public static void main(String[] args)
	{
		int sum = 0;
		int count =0;

		int a[] = {1,2,3,4,5,7};


		for(int i = 0; i < a.length/2; i++)
		{

			sum = sum + a[i];
			count++;
		}
		System.out.println("Sum="+sum);
		int c =sum/count;
		System.out.println("count="+count);
		System.out.println("Avg="+c);
	}

}
