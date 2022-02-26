package programs;
import java.util.Scanner;
public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int n=1;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.format("%02d ",n);
				n++;
			}
			System.out.println();
		}

	}

}
