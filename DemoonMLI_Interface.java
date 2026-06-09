package module2;
//Level 1 Interface
interface Level1 {
 void method1();
}

//Level 2 Interface (extends Level1)
interface Level2 extends Level1 {
 void method2();
}

//Level 3 Interface (extends Level2)
interface Level3 extends Level2 {
 void method3();
}

//Implementation Class
public class DemoonMLI_Interface implements Level3 {

    // Implement all methods
    public void method1() {
        System.out.println("Method 1 from Level1");
    }

    public void method2() {
        System.out.println("Method 2 from Level2");
    }

    public void method3() {
        System.out.println("Method 3 from Level3");
    }

    public static void main(String[] args) {

    	DemoonMLI_Interface obj = new DemoonMLI_Interface();

        obj.method1();
        obj.method2();
        obj.method3();
    }
}
