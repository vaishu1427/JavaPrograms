package programs;
import java.util.*;


public class AreaofTriangle2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base and height:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		float s=(a+b+c)*0.5f;
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("The area is "+area);
		sc.close();
		
		

	}

}
