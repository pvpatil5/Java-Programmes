package pac;

public class Arrays_asscending_des 
{

	public static void main(String[] args)
	{
		//int arr[]= {8,6,1,4,3};
		char arr[]= {'d','e','q','a'};
		char temp;
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]>arr[j]) //just change the symbol > for descending
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
		}


	}

}
