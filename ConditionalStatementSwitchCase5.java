package programs;
import java.util.Scanner;

public class ConditionalStatementSwitchCase5 {

	public static void main(String[] args) {
		
		// Make a menu driven program for arithmetic operations
		System.out.println("MENU");
		System.out.println("====");
		System.out.println("ADD");
		System.out.println("SUB");
		System.out.println("MUL");
		System.out.println("DIV");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("Enter an operation in words");
		sc.nextLine();   /* When we are reading string immediately after the reading of integer means, it will not read.So 
		                    that we should give like this --->  sc.nextLine once again.  */ 
		String b=sc.nextLine();
		switch(b)
		{
		case "ADD":System.out.println("Sum is "+(n1+n2));
		break;
		case "SUB":System.out.println("Difference is "+(n1-n2));
		break;
		case "MUL":System.out.println("Product is "+(n1*n2));
		break;
		case "DIV":System.out.println("Ratio is "+(n1/n2));
		break;
		default :System.out.println("Invalid operation");
		break;
		}
        sc.close();
	}

}
