package arrays_practice_prog;

public class OddIndex_Reverse 
{

	public static void main(String[] args) 
	{
		int a[]= {22,25,44,88,62,47,68,12,18};
		for (int i = a.length-1; i >=0; i--) 
		{
			if(i%2!=0) 
			{
				System.out.print(a[i]+" ");
			}
		}

	}

}



