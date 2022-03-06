package programs;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		try {
			int A[]= {1,2};
			int a,b,c;
			try {
				a=10;
				b=0;
				c=a/b;
				System.out.println(c);
				
			}
			catch(ArithmeticException e ) {
				System.out.println(e);
			}
			
			System.out.println(A[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

	}

}
