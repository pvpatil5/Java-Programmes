package pac;

public class Arrays_Duplicates {

	public static void main(String[] args) 
	{
		int arr[]= {2,3,5,2,5};
		int count;
		for (int i = 0; i < arr.length; i++) 
		{
			count=1;
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]==arr[j]) 
				{
				arr[j]='0';
				}
			}
			if(count>=1 && arr[i]!='0') 
			{
				System.out.print(arr[i]+" ");
			}
		}

	}

}
