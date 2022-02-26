package programs;
import java.util.Scanner;

// Reversing a number or array using method overloading 


public class MethodOverloading_ReverseNumOrArr {
	static int num(int n) {
		int res=0;
		while(n>0) {
			
			int r=n%10;
			res=res*10+r;
			n=n/10;
			
		}
		return res;
	}
	static int[] num(int a[],int number) {
		int newarr[]=new int[number];
		for(int i=number-1,j=0;i>=0;i--,j++) {
			newarr[i]=a[j];
		}
		
		return newarr;
	}

	public static void main(String[] args) {
		System.out.println(num(324));
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		
		int number=sc.nextInt();
		int b[]=new int[number];
		for(int i=0;i<number;i++) {
			b[i]=sc.nextInt();
		}
		int x1[]=num(b,number);
		for(int x:x1) {
			System.out.print(x+" ");
		}

	}

}
