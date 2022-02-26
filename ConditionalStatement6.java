package programs;
import java.util.Scanner;

public class ConditionalStatement6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		String a=sc.next();
		if(a.matches("[01]+"))
		{
			System.out.println("Binary - Radix 2");
		}
		else if(a.matches("[0-7]+"))
		{
			System.out.println("Octal - Radix 8");
		}
		else if(a.matches("[0-9]+"))
		{
			System.out.println("Decimal - Radix 10");
		}
		else if(a.matches("[0-9A-F]+"))
		{
			System.out.println("Hexa - Radix 16");
		}
		else
		{
			System.out.println("Number is not valid");
		}
		sc.close();
	}

}
