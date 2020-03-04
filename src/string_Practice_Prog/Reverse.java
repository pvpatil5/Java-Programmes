package string_Practice_Prog;

public class Reverse {

	public static void main(String[] args) 
	{

		String s= "Test Yantra";
		String st[]=s.split(" ");
		for (int i = 0; i < st.length-1; i++) 
		{
			System.out.println(i+"="+st[i]);
			char c[]=st[i].toCharArray();
			for (int j = st[0].length()-1; j >=0; j--) 
			{
				System.out.println(c[i]);
			}
			System.out.println();
		}

	}

}
