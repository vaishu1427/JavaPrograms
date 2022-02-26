package programs;
import java.util.Scanner;
public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String temp = "";
		for(int i=a.length()-1;i>=0;i--) {
			temp=temp+a.charAt(i);
		}
		if(temp.equals(a)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}

	}

}
