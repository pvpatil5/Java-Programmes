package patterns;

public class Number_ {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int number=1;
		int lines =4;
		int spacecount=3;
		int no=0;
		for (int i = 0; i < lines; i++) 
		{
			for (int j = 0; j < spacecount; j++) 
			{
				System.out.print(" ");
			}
			no= no+i;
			for (int j = 0; j < number; j++)
			{
				System.out.print(no);
				no--;
				
			}
			no = no+i;
			//no++;
			spacecount--;
			System.out.println();
		}
		

	}

}
