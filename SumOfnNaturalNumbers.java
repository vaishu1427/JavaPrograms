package programs;
import java.util.Scanner;
public class SumOfnNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int k=0;
		for(int i=1;i<=a;i++) {
			k=k+i;
			
		}
		System.out.println(k);

	}

}
