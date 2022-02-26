package programs;
import java.util.Scanner;
public class UsingMethod_MaxEleInArray2 {
	static int maxelement(int a[]) {
		java.util.Arrays.sort(a);
		return (a[a.length-1]);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int n[]=new int[a];
		for(int i=0;i<a;i++) {
			n[i]=sc.nextInt();
		}
		System.out.println(maxelement(n));

	}

}
