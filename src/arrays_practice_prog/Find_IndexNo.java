package arrays_practice_prog;

public class Find_IndexNo
{

	public static void main(String[] args) 
	{
		int arr[]= {2,8,6,7,3,4,9};
		int d=arr.length;
		System.out.println("Length of array="+d);
		int a=4;
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]==a)
			{
				System.out.println("Index no="+i);
			}
		}
	}
}
