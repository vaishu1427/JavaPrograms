package programs;
import java.util.Scanner;
public class Method3 {
	static void email(String a) {
		int i=a.indexOf('@');
		String s1=a.substring(0,i);
		System.out.println(s1);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a valid email adress");
		String s=sc.nextLine();
		email(s);

	}

}
