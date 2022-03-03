package programs;
abstract class Mine  {                              // abstract class without abstract method.
	   public void display() {
	      System.out.println("This is a method of abstract class");
	   }
	   
	}
class Nyy extends Mine{                             // not an abstract class.we can create the object and access.
	public void display() {
		System.out.println("Hello world");
	}
}
	public class AbstractClasswithoutAbstractMeth3{
	   public static void main(String args[]) {
	      //new NY().display();
		   Nyy a =new Nyy();
		   a.display();
	   }
	}

