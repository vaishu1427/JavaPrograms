package programs;
import java.util.Scanner;

public class ConditionalStatement7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year:");
		int a=sc.nextInt();
		if(a%4==0)
		{
			if(a%100==0)
			{
				if(a%400==0)
				{
					System.out.println("It is leap year");
				}
				else
				{
					System.out.println("It is not a leap year");
					
				}
			}
			else
			{
				System.out.println("It is leap year");
			}
		}
		else
		{
			System.out.println("It is not a leap year");
		}
		
		sc.close();
	}
}
