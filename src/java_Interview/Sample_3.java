package java_Interview;

public class Sample_3 extends Sample_1
{	
	public  void testSample()
	{
		System.out.println("running sample 3 Sample_3");
	}
	
	public void mtd2Sample2() 
	{
	System.out.println("running mtd2 from sample_3");	
	}
	
	public static void main(String[] args) 
	{
	
	Sample_1 s1= new Sample_3();// Upcasting Statement
	s1.mtd2Sample2();
		
	}

}
