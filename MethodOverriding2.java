package programs;
class Superr{
	public void display() {
		System.out.println("Hello");
	}
}
class Subb extends Super{
	public void display() {
		System.out.println("Hello world");
	}
}
public class MethodOverriding2 {

	public static void main(String[] args) {
		Super s=new Sub();             // Dynamic method dispatch  (reference of the super class is holding the object of the sub class
		s.display();

	}

}
