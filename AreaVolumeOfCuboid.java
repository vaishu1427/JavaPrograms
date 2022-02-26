package programs;
import java.util.*;

public class AreaVolumeOfCuboid {

	public static void main(String[] args) {
		int l,b,h;
		int area,volume;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length , breadth , height :");
		l=sc.nextInt();
		b=sc.nextInt();
		h=sc.nextInt();
		/* int front=2*(l*h);
		int left=2*(b*h);
		int top=2*(l*b);
		area=front+left+top; */
		area=2*(l*b+l*h+b*h);
		volume=l*b*h; 
		System.out.println(area);
		System.out.println(volume);
	    sc.close();
	}

}
