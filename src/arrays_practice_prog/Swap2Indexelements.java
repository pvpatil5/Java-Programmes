package arrays_practice_prog;

public class Swap2Indexelements {

	public static void main(String[] args)
	{
		int a[] ={5,8,7,3,6,2};
		System.out.println("Before Swapping");
		for (int j = 0; j < a.length; j++)
		{
			System.out.print(a[j]+" ");	
		}
		System.out.println();
		int b=0;
		b=a[1];
		a[1]=a[2];
		a[2]=b;
		System.out.println("After Swapping");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(+a[i]+" ");
		}
	}

}
