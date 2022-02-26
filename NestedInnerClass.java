package programs;
class Outer{
	int x=10;
	//Inner i=new Inner();    We can declare like this also
	class Inner{
		int y=20;
		public void Innerclass(){
			System.out.println(x+" "+y);
		}
	}
	public void InnerClasscAcess() {
		Inner i=new Inner();
		System.out.println(i.y);
		i.Innerclass();
	}	
}
public class NestedInnerClass {

	public static void main(String[] args) {
		Outer o=new Outer();
		Outer.Inner out=new Outer().new Inner();
		out.Innerclass();// To access specifically the inner class. 
		o.InnerClasscAcess();
		


	}

}
