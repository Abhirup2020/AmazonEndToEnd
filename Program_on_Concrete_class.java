package module2;
//Grandparent (Concrete Class)
class GrandParent {

 // Static method
 static void grandParentStatic() {
     System.out.println("This is GrandParent static method");
 }

 // Non-static method
 void grandParentMethod() {
     System.out.println("This is GrandParent non-static method");
 }
}

//Parent (Abstract Class)
abstract class Parent extends GrandParent {

 // Abstract method
 abstract void add(int a, int b);

 // Concrete method
 void parentMethod() {
     System.out.println("This is Parent class method");
 }
}

public class Program_on_Concrete_class extends Parent {

    // Implement abstract method
    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }

    // Child's own method
    void childMethod() {
        System.out.println("This is Child class method");
    }

    public static void main(String[] args) {

    	Program_on_Concrete_class obj = new Program_on_Concrete_class();

        // Calling GrandParent methods
        GrandParent.grandParentStatic(); // static
        obj.grandParentMethod();         // non-static

        // Calling Parent method
        obj.parentMethod();

        // Calling Child methods
        obj.childMethod();
        obj.add(10, 20);
    }
}



