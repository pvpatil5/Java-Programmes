package arrays_practice_prog;
public class Avg_value 
{
	public static void main(String[] args)
	{
		int a[]= {5,35,62,4,84,7,9,99};
		int sum=0;
		for (int i = 0; i < a.length; i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		int avg= sum/a.length;
		System.out.println(avg);
	}
}