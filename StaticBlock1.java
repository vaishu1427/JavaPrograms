package programs;

public class StaticBlock1 {
	static {
		System.out.println("Block 1");
	}

	public static void main(String[] args) {  //---> Once the class gets loaded , the static block gets executed first and then the main function is executed
		 System.out.println("Main");

	}
	static {
		System.out.println("Block 2");
	}

}
