package arrays_practice_prog;

public class Find_IndexNo
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[]= {2,8,6,7,3,4,9};
		int d=arr.length;
		System.out.println(d);
		int a=9;
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]==a)
			{
				System.out.println(i);
			}
		}

	}

}
