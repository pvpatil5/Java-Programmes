package pac;

public class Occurences_String {

	public static void main(String[] args) 
	{
		String s1= "pavana";
		int count;
		char arr[]=s1.toCharArray();
		for (int i = 0; i < arr.length; i++) 
		{
			 count =1;
			for (int j = i+1; j < arr.length; j++)
			{
				if (arr[i]==(arr[j]))
				{
					count++;
					arr[j]='0';
				}
			}
			if(arr[i]!='0'&& count<=1) 
			{
				System.out.println(arr[i]+" count is="+count );  
			}
		}



	}

}
