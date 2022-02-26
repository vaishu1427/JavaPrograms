package programs;
import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int s=sc.nextInt();
		int k=1;
		//for(i=1;i<=n;i++)
		for(int i=s;i>=1;i--) {
			k=k*i;
		}
		System.out.println(k);
		

	}

}
