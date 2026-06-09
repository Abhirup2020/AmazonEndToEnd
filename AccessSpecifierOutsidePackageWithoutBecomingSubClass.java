package module2;

public class AccessSpecifierOutsidePackageWithoutBecomingSubClass extends AccessSpecifierOutsidePackageBecomingSubClass2
{
	public static void main(String[] args) 
	{
		
		AccessSpecifierOutsidePackageBecomingSubClass2.add();
		System.out.println(AccessSpecifierOutsidePackageBecomingSubClass2.a);
		
	}
}
