package arrays_practice_prog;

public class Reverse_2nd_half {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		{
			int a[]= {2,5,7,9,6,8};
			for (int j = 0; j < a.length/2; j++) 
			{
				System.out.print(a[j]+" ");
			}
			for (int i = a.length-1; i >= a.length/2; i--)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}