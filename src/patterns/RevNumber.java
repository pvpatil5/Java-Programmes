package patterns;

public class RevNumber {

	public static void main(String[] args) 
	{
		int num=8147;
		int rev = 0;
		int rem = 1;
		//while(num>0) 
		for (int i = 0; i <=5; i++) 
		{
			rem = num%10;
			rev =rev*10+rem;
			num= num/10;
		}
		System.out.println(rem);	
	}
}
