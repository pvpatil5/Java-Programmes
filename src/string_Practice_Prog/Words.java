package string_Practice_Prog;

public class Words 
{
	public static void main(String[] args) 
	{
		String sampleSentence = "The quick Flash";
		String[] words = sampleSentence.split(" ");
		int itemCount = words.length;
		System.out.println("The number of words is: " + itemCount);
		for (int i = 0; i < itemCount; i++) 
		{
			String word = words[i];
			System.out.println(word);
		}
	}
}