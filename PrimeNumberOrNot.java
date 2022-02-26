package programs;
import java.util.Scanner;
public class PrimeNumberOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		boolean flag=false;
		for(int i=2;i<=a/2;i++) {
			if(a%i==0) {
				flag = true;
				break;
			}
		}
		if(flag==true) {
			System.out.println("Not a prime");
		}
		else {
			System.out.println("Prime");
		}

	}

}
