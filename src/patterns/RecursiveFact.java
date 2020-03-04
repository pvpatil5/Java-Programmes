package patterns;

public class RecursiveFact {

	int num=5;
	int fact=1;

	public void recursive() 
	{
		if(num>0)	
		{
			fact=num*fact;
			num--;
			recursive();
		}
	}

	public static void main(String[] args) 
	{
		RecursiveFact rf1= new RecursiveFact();
		rf1.recursive();
	}
}
