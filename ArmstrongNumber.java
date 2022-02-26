package programs;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		int sum=0;
		int temp=a;
		while(a>0) {
			int b=a%10;
			a=a/10;
		    sum=sum+b*b*b;
			
		}
		
		System.out.println(sum);
		if(temp==sum) {
			System.out.println("It is an armstrong number");
			
		}
		else {
			System.out.println("It is not an armstrong number");
		}
		

	}

}
