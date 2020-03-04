package string_Practice_Prog;

public class String_Rotation 
{
	public static void main(String[] args) 
	{
		String s= "Today is monday";
		String[] st= s.split(" ");
		for (int i = st.length-1; i >=0 ; i--)
		{
			int index=i;

			for (int j = st.length-1; j >=0 ; j--) 
			{
				System.out.println(st[index]+" ");
				index++;
				index= index%(st.length);
			}
			System.out.println();
		}
	}
}
