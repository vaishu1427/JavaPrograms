package programs;
import java.util.Scanner;

public class CountDigitsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		long a=sc.nextLong();
		long count=0;
		while(a>0) {
			/*long n=a%10;
			a=a/10;*/
			a=a/10;
			count=count+1;
			
		}
		System.out.println(count);

	}

}
