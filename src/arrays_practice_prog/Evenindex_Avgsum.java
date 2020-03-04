package arrays_practice_prog;

public class Evenindex_Avgsum {

	public static void main(String[] args) 
	{
		int a[]= {2,5,8,7,6,3,4,7,9};
		int sum=0;
		int count=0;

		for (int i = 0; i < a.length; i++) 
		{
			if(i%2==0) 
			{
				sum=sum+a[i];
				count++;

			}
		}
		System.out.println(sum);
		double c= sum/count;
		System.out.println(count);
		System.out.println(c);
	}

}
