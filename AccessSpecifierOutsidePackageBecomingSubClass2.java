package module2;
import module2.AccessSpecifierOutsidePackageBecomingSubClass;
public class AccessSpecifierOutsidePackageBecomingSubClass2 {
	public static int a=100;
	protected static int b=40;
	 static int c=10;
	private static int d=5;
	
	
	
	public static void add()
	{
		System.out.println("Addition");
	}
	protected static void sub()
	{
		System.out.println("Subtraction");
	}
	static void mul()
	{
		System.out.println("Multiplication");
	}
	private static void div()
	{
		System.out.println("Divison");
	}
	
}
