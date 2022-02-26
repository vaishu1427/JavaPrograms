package programs;
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int i=sc.nextInt();
		for(int j=1;j<=10;j++) {
			System.out.println(i+" x "+j+" = "+i*j);
		}

	}

}
