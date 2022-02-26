package programs;
import java.util.Scanner;

public class ConditionalStatement4 {

	public static void main(String[] args) {
		// Person is young or not
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		if(n>=14 && n<=55)
		{
			System.out.println("You are young");
		}
		else
		{
			System.out.println("You are old");
		}
		
		/* if(n<14 || n>55)
		 * {
		 *   System.out.println("Not young");
		 * }
		 * else
		 * {
		 *   System.out.println("young");
		 * }
		 */
		sc.close();
	}

}
