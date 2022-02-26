package programs;
import java.util.Scanner;

public class ConditionalStatement5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m1 mark:");
		int m1=sc.nextInt();
		System.out.println("Enter m2 mark:");
		int m2=sc.nextInt();
		System.out.println("Enter m3 mark:");
		int m3=sc.nextInt();
		int total=m1+m2+m3;
		int avg=total/3;
		if(avg>=70 && avg<=100)
		{
			System.out.println("A");
		}
		else if(avg>=60 && avg<70)
		{
			System.out.println("B");
		}
		else if(avg>=50 && avg<60)
		{
			System.out.println("C");
		}
		else if(avg>=40 && avg<50)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("F");
		}
		sc.close();

	}

}
