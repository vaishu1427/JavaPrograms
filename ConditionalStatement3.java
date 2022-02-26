package programs;
import java.util.Scanner;

public class ConditionalStatement3 {

	public static void main(String[] args) {
		 // Given number is odd or even
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
        sc.close();
	}

}
