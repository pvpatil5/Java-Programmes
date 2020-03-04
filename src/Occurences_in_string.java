import java.util.Scanner;

public class Occurences_in_string {

	public static void main(String[] args)
	{
	int count=0;
	String s= "hello everyone";
	char c[]=s.toCharArray();
	System.out.println("enter the character");
		Scanner scan=new Scanner(System.in);
		char st= scan.next().charAt(0);
		for (int i = 0; i < c.length; i++) 
		{
			if(st==c[i]) 
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
