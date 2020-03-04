package arrays_practice_prog;

public class Right_Shift {

	public static void main(String[] args)
	{
		int arr[]= {5,7,1,9,3};
		for (int i = 0; i < arr.length; i++) 
		{
			int index=i;
			for (int j = 0; j < arr.length; j++) 
			{
				System.out.print(arr[index]);
				index++;
				index=index%arr.length;
			}
			System.out.println();
		}

		
	}

}
