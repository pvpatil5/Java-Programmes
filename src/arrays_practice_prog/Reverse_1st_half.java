package arrays_practice_prog;

public class Reverse_1st_half
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		{
			int a[]= {2,5,7,9,6,8};
			for (int i = a.length/2-1; i >=0; i--)
			{
				System.out.print(a[i]+" ");
			}
			for (int j = a.length/2; j < a.length; j++) 
			{
				System.out.print(a[j]+" ");
			}
		}
	}
}
