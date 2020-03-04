package collections_Practice_Prog;

import java.util.HashSet;

public class Set_to_Hashset {

	public static void main(String[] args)
	{
		HashSet hs = new HashSet();
	
		hs.add("first");
		hs.add("second");
		hs.add("third");
		System.out.println(hs);
		/*HashSet subSet = new HashSet();
		subSet.add("s1");
		subSet.add("s2");
		hs.addAll(subSet);
		System.out.println("HashSet content after adding another collection:");
		System.out.println(hs);
		 */
		HashSet hs2=(HashSet)hs.clone();
		System.out.println("copied elements are="+hs2);

	}

}
