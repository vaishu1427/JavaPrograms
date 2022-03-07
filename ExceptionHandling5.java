package programs;

public class ExceptionHandling5 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,0};
		try {
			int c =a[0]/a[4];
			try {
				System.out.println(a[5]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			//int c =a[0]/a[4];
		}
		catch (ArithmeticException e) {
			System.out.println("Denominator should not be zero " + e);
		}
	}

	

}
