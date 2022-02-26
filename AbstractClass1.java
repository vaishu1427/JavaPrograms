package programs;
abstract class Strong{
	public Strong() {
		System.out.println("Super class");
	}
	abstract public void display1();
}
class Weak extends Strong{
	public Weak() {
		System.out.println("sec constructor");
	}
	public void display1() {
		System.out.println("Sub class");
	}
	
}
public class AbstractClass1 {

	public static void main(String[] args) {
		Weak w=new Weak();
		//Strong w=new Weak();
		w.display1();

	}

}
