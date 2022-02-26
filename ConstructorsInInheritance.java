package programs;
class Parent{
	public Parent() {
		System.out.println("Parent constructor");
	}
}
class Child extends Parent{
	public Child() {
		System.out.println("Child constructor");
	}
}
class GrandChild extends Child {
	public GrandChild(){
		System.out.println("Grand Child constructor");
	}
}
public class ConstructorsInInheritance {

	public static void main(String[] args) {
		GrandChild g=new GrandChild();  //Here when the child class is called , the parent class is first called.Because, the child class is an extension of the parent class

	}

}
