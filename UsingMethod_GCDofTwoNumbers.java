package programs;
import java.util.Scanner;
public class UsingMethod_GCDofTwoNumbers {
	static int gcd(int x,int y) {
		while(x!=y) {
			if(x>y) {
				x=x-y;
			}
			else {
				y=y-x;
			}
		}
		return x;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(gcd(a,b));

	}

}
