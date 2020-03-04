package arrays_practice_prog;

public class OddEven_Swap
{
	public static void main(String[] args) 
	{
		int arr[]= {2,6,8,9,2,7,3};
		int a=0;
		for (int i = 1; i < arr.length; i+=2)
		{
			a=arr[i];
			arr[i]=arr[i-1];
			arr[i-1]=a;
			
		}
		for (int j = 0; j < arr.length; j++)
		{
			System.out.println(arr[j]);
		}
	}
}