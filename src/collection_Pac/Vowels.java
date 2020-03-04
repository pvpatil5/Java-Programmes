package collection_Pac;

public class Vowels {

	public static void main(String[] args) 
	{
	String s1="pavanpatil";
	char vowels[]= {'a','e','i','o','u'};
	char name[]=s1.toCharArray();
	int k=0;
	String s="";
	for (int i = 0; i < name.length; i++) 
	{
		for (int j = 0; j < vowels.length; j++)
		{
			if(name[i]==vowels[j]) 
			{
				s=s+name[i];
			}
			
		}
	}
	System.out.println(s);

	}

}
