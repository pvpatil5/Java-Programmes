package string_Practice_Prog;

import java.util.Scanner;

public class Length 
{
public static void main(String[] args)
{
	System.out.println("Enter Word=");
	Scanner scan= new Scanner(System.in);
	String s= scan.next();
	//String s="India";
	//System.out.println(s.length());
	char c[]=s.toCharArray();
	int count=0;
	for (int i = 0; i < c.length; i++)
	{
		count++;
	}
	System.out.println(count);
	scan.close();
}
}
