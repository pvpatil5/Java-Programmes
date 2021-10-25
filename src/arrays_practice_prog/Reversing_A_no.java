package arrays_practice_prog;

public class Reversing_A_no {

	public static void main(String[] args) {

		int n=23;
		String st="";
		String str=n+st;
		char[] s1=str.toCharArray();
		for (int i = s1.length-1; i >=0; i--)
		{
			System.out.print(s1[i]);

			//System.out.println();
		}
		//		int firstnum= n/100;
		//		int secondnum=n%100;
		//		int product= firstnum * secondnum;
		//		System.out.println(product);
	}
}
