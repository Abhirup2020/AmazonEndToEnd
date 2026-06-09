package module2;
import module2.AccessSpecifierOutsidePackageBecomingSubClass;
public class AccessSpecifierOutsidePackageBecomingSubClass extends AccessSpecifierOutsidePackageBecomingSubClass2
{
	public static void main(String[] args) 
	{
		
		AccessSpecifierOutsidePackageBecomingSubClass2.add();
		AccessSpecifierOutsidePackageBecomingSubClass2.sub();
		System.out.println(AccessSpecifierOutsidePackageBecomingSubClass2.a);
		System.out.println(AccessSpecifierOutsidePackageBecomingSubClass2.b);
		
	}
}