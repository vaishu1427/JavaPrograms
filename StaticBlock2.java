package programs;
class Tesst{
	static {
		System.out.println("Block 1");
	}
	
	static {
		System.out.println("Block 2");
	}
}
public class StaticBlock2 {

	public static void main(String[] args) {
		
		Tesst t=new Tesst();
		System.out.println("Main");

	}

}
