package arrays_practice_prog;

import java.util.Arrays;

public class Max_2nd_Element {

	public static void main(String[] args) 
	{
		int a[]= {5,35,62,4,84,7,9,99};
		Arrays.sort(a);
		System.out.println(a[a.length-2]);

	}

}
