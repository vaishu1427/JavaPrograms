package programs;

import java.util.Scanner;

public class ConditionalStatement8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of a week");
		int a=sc.nextInt();
		if(a==1)
		{
			System.out.println("Monday");
		}
		else if(a==2)
		{
			System.out.println("Tuesday");
		}
		else if(a==3)
		{
			System.out.println("Wednesday");
		}
		else if(a==4)
		{
			System.out.println("Thursday");
		}
		else if(a==5)
		{
			System.out.println("Friday");
		}
		else if(a==6)
		{
			System.out.println("Saturday");
		}
		else if(a==7)
		{
			System.out.println("Sunday");
		}
		else
		{
			System.out.println("It is not a valid day number");
		}
		sc.close();

	}

}
