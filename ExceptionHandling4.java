package programs;
import java.util.Scanner;

public class ExceptionHandling4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Numbers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c;
		try {
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("Denominator should not be 0 " + e);
		}
	}

}
