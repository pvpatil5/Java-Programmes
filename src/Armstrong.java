
public class Armstrong 
{
	public static void main(String[] args) 
	{
		int n=153;
		int temp=n;
		int c=0;
		int a;
		//int b=String.valueOf(no).length();
		//int count=0;
		/*while(no!=0) 
		{
			no=no/10;
		}

		System.out.println(count);*/
		while(n>0) 
		{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		System.out.println(temp);
		System.out.println(c);
		
	}
}
