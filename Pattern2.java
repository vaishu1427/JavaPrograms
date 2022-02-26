package programs;
import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				System.out.print((i+j)+" ");
			}
			System.out.println("");
		}
		sc.close();
	}

}
