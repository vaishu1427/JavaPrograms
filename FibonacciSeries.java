package programs;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int a1=0;
		int b1=1;
        int c1=0;
        if(a==1) {
        	System.out.println("1");
        	System.exit(0);
        }
        else{//System.out.print(a1+","+b1);
        	for(int i=0;i<a-1;i++) {
        		c1=a1+b1;
			
        		a1=b1;
        		b1=c1;
        	}
        	
        }
        System.out.print(c1);
		
		

	}

}
