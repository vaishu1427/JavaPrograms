package programs;
class Parent1 {
	public Parent1() {
		System.out.println("parent no param");
	}
	public Parent1(int x) {
		System.out.println("parent paramc"+x);
	}
}
class Child1 extends Parent1{
	public Child1() {
		System.out.println("child no param");
	}
	public Child1(int x,int y) {
		super(x);
		System.out.println("Child param "+y);
	}
}
public class ParametrisedConstructorInInheritance1 {

	public static void main(String[] args) {
		Child1 c=new Child1(10,20);

	}

}
