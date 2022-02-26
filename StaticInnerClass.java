package programs;
class Outers{
	static int x=10;
	int y=20;
	static class Inner{
		void display() {
			System.out.println(x);
			//System.out.println(y);
		}
	}
	void accessInnerclass() {
		Inner n=new Inner();
		n.display();
		System.out.println(y);
	}
}
public class StaticInnerClass {

	public static void main(String[] args) {
		
		Outers.Inner i=new Outers.Inner();
		i.display();
		Outers o=new Outers();
		o.accessInnerclass();
		
	}

}
