package programs;
import java.util.Scanner;
public class NestedForLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				System.out.print(i+""+j+" ");
			}
			System.out.println("");
		}
	    sc.close();

	}

}
