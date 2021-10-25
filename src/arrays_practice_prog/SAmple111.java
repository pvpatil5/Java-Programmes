package arrays_practice_prog;

import java.util.TreeSet;

class DemoA
{
	public void run()
	{
		System.out.println("Hi");
	}
}
class  DemoB extends DemoA
{

	public void run()
	{
		System.out.println("Welcome");
	}
	public static void main(String[] args) {
		//
		DemoA d = new DemoA();
		DemoB d2 = new DemoB();
		DemoB d1 = (DemoB)d;  //class cast exception..

	}
}