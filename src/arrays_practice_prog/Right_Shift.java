package arrays_practice_prog;

public class Right_Shift {

	public static void main(String[] args)
	{
		int arr[]= {5,7,1,9,3};
		//int choice=2;
		for (int i = 0; i <= arr.length-1; i++) 
		{
						int index=i;
						for (int j = 0; j <= arr.length-1; j++) 
						{
							System.out.print(arr[index]);
							index++;
							index=index%arr.length;
						}
						System.out.println();
//			int temp=arr[0];
//			for (int j = 0; j < arr.length; j++) 
//			{
//				arr[j]=arr[j+1];
//			}
//			arr


		}
	}

}
