package programs;
import java.util.Scanner;

public class APSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the starting point:");
		int a=sc.nextInt();
		System.out.println("Enter the common difference:");
		int d=sc.nextInt();
		System.out.println("Enter the no of digits you want:");
		int n=sc.nextInt();
		int term=a;
		for(int i=0;i<n;i++) {
			System.out.print(term+",");
			term=term+d;
		}

	}

}
