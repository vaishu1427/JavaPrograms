package programs;
import java.util.Scanner;

public class ReversingNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		String s="";
		int a=sc.nextInt();
		while(a>0) {
			int r=a%10;
			a=a/10;
		    s=s+r;
		}
		System.out.println(s);
	}

}
