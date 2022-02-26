package programs;
class FinalTest{
	static int M=90; //---> This also direct declaration
	final int Y=10; 
	final int Z;//---> Direct initialization
	static final int X;  //---> Inside static block
	static 
	{
	X=10;
	}
	FinalTest(){ //---> Inside the constructor
		Z=90;
	}
}
public class Final1 {

	public static void main(String[] args) {
		
		final int D;  // Inside method we can declare like this.But as a member of  class,we cannot declare.
		D=90;
		final int X;  //--->Inside instance block
		{
			X=10;
		}

	}

}
