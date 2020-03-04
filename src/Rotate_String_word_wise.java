
public class Rotate_String_word_wise 
{

	public static void main(String[] args) 
	{
	String s= "Happy Pongal to everyone";
	
	String st[]=s.split(" ");
	
	for (int i = st.length-1; i >=0; i--) 
	{
		int index=i;
		for (int j=st.length; j >=0; j--) 
		{
			System.out.print(st[index]+" ");
			index++;
			index=index%4;
		}
		System.out.println();
	}

	}

}
