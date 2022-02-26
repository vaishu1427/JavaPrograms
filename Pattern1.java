package programs;
import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		
		for(int i=1;i<=a;i++) {
			int b=1;
			for(int j=1;j<=a;j++) {
				System.out.print(b+" ");
				b++;
			}
			System.out.println("");
			 /*
		    public static void main(String[] args) 
		    {
		      for(int i=1;i<=5;i++)
		      {
		          for(int j=1;j<=5;j++)
		          {
		            System.out.println(j+" ");
		          }
		          System.out.println("");
		      }
		    }
		    */
		}

	}

}
