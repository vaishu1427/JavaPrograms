package programs;

public class ExceptionHandlingFinallyBlock2 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("End of the program");
		}
		//System.out.println("End of the program");
	}

}
