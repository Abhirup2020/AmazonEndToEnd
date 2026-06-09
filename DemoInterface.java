package module2;

//Interface
interface Calculator {

 void add(int a, int b);
 void sub(int a, int b);
}


//Implementation Class
public class DemoInterface implements Calculator {

    // Implement add method
    public void add(int a, int b) {
        int sum = a + b;
        System.out.println("Addition = " + sum);
    }

    // Implement sub method
    public void sub(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction = " + result);
    }

    // Main method
    public static void main(String[] args) {

    	DemoInterface obj = new DemoInterface();

        obj.add(10, 5);
        obj.sub(10, 5);
    }
}
