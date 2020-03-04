package arrays_practice_prog;
public class Minvalue_evenindex 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]= {22,25,44,88,62,47,68,12,18};
		int min=a[0] ;
		for (int i = 0; i < a.length; i++) 
		{
			if(i%2==0) 
			{
				if(min>a[i]) 
				{
					min=a[i];
				}
			}
		}
		System.out.println(min);
	}
}

