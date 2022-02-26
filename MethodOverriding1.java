package programs;
class Super{
	public void display() {
		System.out.println("Hello");
	}
	public void start() {
		System.out.println("c1");
	}
}
class Sub extends Super{
	public void display() {
		System.out.println("Hello world");
	}
	public void start() {
		System.out.println("c2");
	}
}
public class MethodOverriding1 {

	public static void main(String[] args) {
		Super s=new Super();
		s.display();
		Sub s1=new Sub();
		s1.display();  
		s1.start();      // The method of the super class is hidden and the method of the object is called.

	}

}
