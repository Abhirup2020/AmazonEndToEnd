package module2;

abstract class T4 //abstract class
{
	abstract void method1();//abstract Method
	abstract void method2();//abstract Method
}
public class Program_on_100_abstraction extends T4
{
	void method1()
	{
		System.out.println("Actual Logic 1 will be here");
	}
	void method2()
	{
		System.out.println("Actual Logic 2 will be here");
	}
	public static void main(String[] args) 
	{
	System.out.println("Main Method Program");
	Program_on_100_abstraction a1=new Program_on_100_abstraction();
	a1.method1();
	a1.method2();
	}
}
