package programs;
abstract class MyClass {
	   public void display() {
	      System.out.println("This is a method of abstract class");
	   }
	}
	public class AbstractClasswithoutAbstractMeth1 extends MyClass{
	   public static void main(String args[]) {
	      new AbstractClasswithoutAbstractMeth1().display();
	   }
	}
