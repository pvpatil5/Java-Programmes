package arrays_practice_prog;

public class OddIndex_Minvalue {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a[]= {6,7,8,2,6,4,7,10,5};
		int min=a[0];

		for (int i = 0; i < a.length; i++) 
		{
			if (i%2!=0)
			{
				if(a[i]<min)
				{
					min=a[i];	
				}

			}
		}

		System.out.println(min);

	}

}
