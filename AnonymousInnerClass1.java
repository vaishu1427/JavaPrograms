package programs;
abstract class No1{
	abstract public void meth1();
}
class No2 {
	public void  meth2() {  
		No1 n=new No1() {
			public void meth1() {           // display() ---> This also can be given
				System.out.println("Helloo");
			}
		};
		n.meth1();
	}
}
public class AnonymousInnerClass1 {

	public static void main(String[] args) {
		No2 n1=new No2();
		n1.meth2();
	}

}
