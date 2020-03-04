package arrays_practice_prog;

public class Odd_index_sum {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]= {55,78,68,25,4,02,74};
		int sum=0;
		for (int i = 1; i < a.length; i++) 
		{
			if(i%2!=0) 
			{
				sum=sum+a[i];
			}
		}
		System.out.println(sum);
	}

}
