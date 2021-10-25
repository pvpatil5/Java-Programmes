package string_Practice_Prog;
import java.util.Arrays;
import java.util.Scanner;

public class Anagrams 
{
	public static void main(String[] args)
	{
				String s1= "silent";
				String s2="list";
		
				char c1[]=s1.toCharArray();
				char c2[]=s2.toCharArray();
				Arrays.sort(c1);
				Arrays.sort(c2);
				
				boolean b= Arrays.equals(c1, c2);
				if(b)
				{
				System.out.println("Anagrams");	
				}
				else 
				{
					System.out.println("not Anagrams");
			}
//
//		System.out.println("Enter String s1 ");
//		Scanner scan = new Scanner(System.in);
//		String s1= scan.next();
//		System.out.println("Enter String s2 ");
//		String s2=scan.next();
//		char c1[]=s1.toCharArray();
//		char c2[]=s2.toCharArray();
//		Arrays.sort(c1);
//		Arrays.sort(c2);
//
//		boolean b= Arrays.equals(c1, c2);
//		if(b)
//		{
//			System.out.println("Anagrams");	
//		}
//		else 
//		{
//			System.out.println("not Anagrams");
//		}
//		scan.close();
	}

}
