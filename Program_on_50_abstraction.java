package module2;
abstract class T5          //ABstarction:50%
{
	abstract void a();
	void mail()
	{
		System.out.println("Real logic Code Getting exposed");
	}
	void b()
	{
		System.out.println("Real logic Code Getting exposed");
	}
}
public class Program_on_50_abstraction extends T5
{
		public static void main(String[] args) 
		{
		System.out.println("Hi");	
		Program_on_50_abstraction b2=new Program_on_50_abstraction();
		b2.mail();
		b2.b();
		b2.a();
		}

		void a() 
		{
			System.out.println("Real logic is getting  hidden here");
		}
	}
