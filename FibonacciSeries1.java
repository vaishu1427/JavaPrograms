package programs;
import java.util.Scanner;
public class FibonacciSeries1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int a=sc.nextInt();
		int a1=0;
		int b1=1;
		System.out.print(a1+","+b1);
		for(int i=0;i<a-2;i++) {
			int c1=a1+b1;
			System.out.print(","+c1);
			a1=b1;
			b1=c1;
		}
		sc.close();

	}

}
