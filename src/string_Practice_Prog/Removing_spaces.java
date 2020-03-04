package string_Practice_Prog;

public class Removing_spaces {

	public static void main(String[] args) 
	{
		String s= "i am student of QSP";
		String str[]=s.split(" ");
		for (int i = 0; i < str.length; i++) 
		{
			System.out.print(str[i]);
		}
	}
}