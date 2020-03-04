package collection_Pac;

public class CalDemo 
{

	public static void main(String[] args) 
	{
//Creating object of interface and using anonymous class for completing method of interface object
		//anonymous class is a class which does not have keyword class 
		Calculator c1= new Calculator() {

			@Override
			public void add(int a, int b) {
				System.out.println(a+b);

			}
		};
		c1.add(50, 87);
	}

}
