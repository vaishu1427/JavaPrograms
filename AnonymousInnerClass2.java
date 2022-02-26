package programs;
abstract class Class1{
	abstract public void meth1();
}
class External{
	public void meth2() {
		new Class1() {     //This is anonymous class as well as anonymous object
			public void meth1() {
				System.out.println("Hai");
			}
		}.meth1();
		//c.meth1();
	}
}
public class AnonymousInnerClass2 {

	public static void main(String[] args) {
		External e=new External();
		e.meth2();

	}

}
