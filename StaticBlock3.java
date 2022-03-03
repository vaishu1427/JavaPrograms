package programs;
class Tessst{
	static {
		System.out.println("Block 1");
	}
	
	static {
		System.out.println("Block 2");
	}
}
class Tesst2 extends Tessst{
	static {
		System.out.println("Block 3");
	}
}
public class StaticBlock3 {
	static {
		System.out.println("0");
	}
	public static void main(String[] args) {
		
		
		Tesst2 t=new Tesst2();
		System.out.println("Main");

	}

}
