package collection_Pac;

import java.util.HashMap;

public class Hash_MAp_Occur {

	public static void main(String[] args) 
	{
		String s1="TESTYANTRA";
		char c[] =s1.toCharArray();
		
		HashMap<Character, Integer> hm= new HashMap<Character, Integer>();
		for (int i = 0; i < c.length; i++) 
		{
			if(hm.containsKey(c[i]))
			{
				//hm.put(key, value)
				hm.put(c[i], hm.get(c[i])+1);
			}
			else
				hm.put(c[i], 1);
		}
		System.out.println(hm);
		System.out.println(hm.keySet());
	
	}

}
