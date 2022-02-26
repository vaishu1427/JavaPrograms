package programs;
import java.util.*;

public class AreaOfTriangle1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base:");
		float b=sc.nextFloat();
		System.out.println("Enter the height");
		float h=sc.nextFloat();
		float area=(0.5f)*(b)*(h);
		// area=base*height/2;
		// area=(1f/2f)*base*height;
		// should not give as (1/2)*b*h; because 1 and 2 is int.so, it will give 0 as ans .
		System.out.println("The area of the triangle is "+area);
		sc.close();
	}

}
