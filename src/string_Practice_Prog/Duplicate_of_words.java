package string_Practice_Prog;

public class Duplicate_of_words {
	public static void main(String[] args) {  

		String string = "Big black bug bit a big black dog on his big black nose";  

		int count;  
		string = string.toLowerCase();  
		String words[] = string.split(" "); //give space (" ") if not given then each alpabet is counted

		System.out.println("Duplicate words in a given string : ");   
		for(int i = 0; i < words.length; i++)
		{  
			count = 1;  
			for(int j = i+1; j < words.length; j++)
			{  
				if(words[i].equals(words[j]))
				{  
					count++;  
					words[j] = "0";  
				}  
			}  
			if(count > 1 && words[i] != "0")  
				System.out.println(words[i]+" count is="+count );  
		} 

	}  
}  




