package programs;
import java.util.Scanner;
public class UsingMethod_MaxEleInArray1 {
	static int maxelement(int a[]) {
		int max1=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max1) {
				max1=a[i];
			}
			
		}
		return max1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(maxelement(a));

	}

}
