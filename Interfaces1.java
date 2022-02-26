package programs;
interface Test1{
	void meth1();
	void meth2();
}
class Test2 implements Test1{
	public void meth1() {
		System.out.println("Meth1");
	}
	public void meth2() {
		System.out.println("Meth2");
	}
	public void meth3() {
		System.out.println("Meth3");
	}

}
public class Interfaces1 {

	public static void main(String[] args) {
		Test1 t=new Test2();
		t.meth2();

	}

}
