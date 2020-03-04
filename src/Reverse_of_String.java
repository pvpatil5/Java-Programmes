
public class Reverse_of_String {

	public static void main(String[] args) 
	{
		String s1= "India is my country";

		System.out.println("Input String "+s1);

		String str[]=s1.split("");

		String a="";

		for (int j = str.length-1; j >=0; j--) 
		{
			a= a+str[j];
		}

		System.out.println(a);
	}

}
