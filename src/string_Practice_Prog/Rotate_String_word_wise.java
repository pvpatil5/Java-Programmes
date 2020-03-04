package string_Practice_Prog;

public class Rotate_String_word_wise 
{

	public static void main(String[] args) 
	{
	String s= "Happy Pongal to everyone";
	
	System.out.println(s.length());
	
	String st[]=s.split(" ");
	
	for (int i = st.length-1; i >=0; i--) 
	{
		int index=i;
		for (int j=st.length-1; j >=0; j--) 
		{
			System.out.print(st[index]+" ");
			index++;
			index=index%4;
		}
		System.out.println();
	}

	}

}
