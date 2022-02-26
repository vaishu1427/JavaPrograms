package programs;
import java.util.Scanner;
public class DisplayDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int r;
			
			while(s!=0) {
				r=s%10;
				System.out.print(r+" ");
				s=s/10;
				
			}
	}

}
