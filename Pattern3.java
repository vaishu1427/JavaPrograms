package programs;
import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		int count=1;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				System.out.format("%02d ",count);
				count++;
			}
			System.out.println("");
		}
		sc.close();
	}

}

