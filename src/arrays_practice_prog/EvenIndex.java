package arrays_practice_prog;

public class EvenIndex {

	public static void main(String[] args) 
	{
		int a[]= {22,25,44,88,62,47,68,12,18};
		System.out.println(a.length);
		for (int i = 0; i < a.length; i++) 
		{
			if(i%2==0) 
			{
				System.out.print(a[i]+" ");
			}
		}

	}
}
