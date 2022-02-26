package programs;
import java.util.Scanner;

public class GPSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int r=sc.nextInt();
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			System.out.print(a+",");
			a=a*r;
		}
		sc.close();

	}

}
