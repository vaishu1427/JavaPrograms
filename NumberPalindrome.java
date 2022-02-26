package programs;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int temp=a;
		int res=0;
		while(a>0) {
			int r=a%10;
			res=res*10+r;
			a=a/10;
		}
		if(temp==res) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}

	}

}
