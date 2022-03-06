package programs;

public class ExceptionHandlingFinallyBlock {

	public static void main(String[] args) {
		int a,b,c;
		try {
			a=10;
			b=0;
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		//finally block will get executed even if the eception occurs or not.
		
		finally {
			System.out.println("Hello");
		}
		System.out.println("Bye");
	}

}
