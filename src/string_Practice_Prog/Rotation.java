package string_Practice_Prog;

public class Rotation 
{	
	static String leftrotate(String str, int d) 
	{ 
		String ans = str.substring(d) + str.substring(0, d); 
		return ans; 
	} 
	static String rightrotate(String str, int d) 
	{ 
		return leftrotate(str, str.length() - d); 
	} 
	public static void main(String args[]) 
	{ 
		String str1 = "TestYantra"; 
		System.out.println(leftrotate(str1, 2)); 

		String str2 = "YantraTest"; 
		System.out.println(rightrotate(str2, 2)); 
	} 
}