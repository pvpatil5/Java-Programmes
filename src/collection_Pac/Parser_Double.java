package collection_Pac;

public class Parser_Double 
{
	public static void main(String[] args) {


		//private static void main(String[] args) {
		String s1="$ 125.8";
		String str[]=s1.split(" ");
		System.out.println(str[0]);
		System.out.println(str[1]);

		double d= Double.parseDouble(str[1]);
		double sum=d+3;
		System.out.println(sum);

		String s3=Double.toString(sum);
		System.out.println(str[0]+s3);
	}
}