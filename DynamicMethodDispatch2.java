package programs;
class A2{
	public void meth1() {
		System.out.println("Hello world");
	}
	
}
class B2 extends A2{
	public void meth1() {
		System.out.println("Hai girls");    // The method is called upon object not upon reference.
	}
}
public class DynamicMethodDispatch2 {

	public static void main(String[] args) {
		A2 a=new B2();
		a.meth1();

	}

}
