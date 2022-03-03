package programs;
abstract class MyClasss {                              // abstract class without abstract method.
	   public void display() {
	      System.out.println("This is a method of abstract class");
	   }
	   
	}
class Ny extends MyClasss{                             // not an abstract class.we can create the object and access.
	
}
	public class AbstractClasswithoutAbstractMeth2 extends MyClass{
	   public static void main(String args[]) {
	      //new NY().display();
		   Ny a =new Ny();
		   a.display();
	   }
	}
