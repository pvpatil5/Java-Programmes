package string_Practice_Prog;

public class Swaping {

	public static void main(String[] args) 
	{
		
		String s1="Banglore";
		String s2="Pune";
		System.out.println("Before Swaping="+s1+" "+s2);
		s1=s1.concat(" "+s2);
		
		s2= s1.split(" ")[0];
		s1=s1.split(" ")[1];

		System.out.println("After Swapping "+s1+" "+s2);
	}

}
