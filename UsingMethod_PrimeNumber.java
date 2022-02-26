package programs;
import java.util.Scanner;
public class UsingMethod_PrimeNumber {
	static boolean prime(int b) {
		for(int i=2;i<=b/2;i++) {
			if(b%i==0) {
				return false;
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		boolean t=prime(a);
		if(t==false) {
			System.out.println("not a prime");
		}
		else {
			System.out.println("prime");
		}
		

	}

}
