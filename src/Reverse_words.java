
public class Reverse_words {
	
		public static void main(String[] args) 
		{
		String s= "Happy Pongal to everyone";
		System.out.println("Original String="+s);
		
		String st[]=s.split(" ");
		System.out.println("Reverse Words");
		for (int i = st.length-1; i >=0; i--) 
		{
			
			System.out.print(st[i]+" ");
		}

		}

	}