package collection_Pac;

public class SingleTon 
{		
	int a;
	int b;
	private SingleTon(int a, int b) 
	{
		super();
		this.a = a;
		this.b = b;
		System.out.println("running pvt const");
		System.out.println(a+b);
	}

	public static SingleTon callConst() 
	{
		SingleTon	s1 = new SingleTon(3, 5);
		System.out.println(s1);
		return s1;
	}
}
