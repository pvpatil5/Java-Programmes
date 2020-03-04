package arrays_practice_prog;

import java.util.Arrays;

public class Sample1 {

	public static void main(String[] args) 
	{
		/*	String s1="abcd@gmail.com";
		String []s2=s1.split("@");
		System.out.println(s2[0]);
		System.out.println("===========");

		int a[]= {1,8,2,7,6,4};
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]+a[j]==10)
				{
					System.out.println(a[i]+" "+a[j]);
				}

			}
		}
		System.out.println("==========");
		int b[]= {1,2,3};
		int sum=1;
		int len=b.length;
		System.out.println(len);*/
	/*	System.out.println("=========");
		int arr[]= {0,1,1,0,1,0,0,1};
		Arrays.sort(arr);
		int abc[]=new int[8];
		for (int i = 0; i < arr.length; i++) 
		{
			abc[i]=arr[i];
			System.out.print(abc[i]);
		}*/
		int q[]= {1,0,-4,2,-2,-1};
		Arrays.sort(q);
		int w[]=new int[q.length];

		for (int i = 0; i < q.length; i++) 
		{
			w[i]=q[i];
			System.out.print(q[i]);
		}



	}

}
