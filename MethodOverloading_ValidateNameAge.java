package programs;
import java.util.Scanner;
public class MethodOverloading_ValidateNameAge {
	static boolean validate(String namee) {
		boolean status=namee.matches("[a-zA-Z\\s]+");
		return status;
	}
	static boolean validate(int agee) {
		if(agee>0 && agee<=15) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name:");
		String name=sc.nextLine();
		boolean v1=validate(name);
		if(v1==true) System.out.println("valid");
		else System.out.println("Not valid");
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		boolean v2=validate(age);
		if(v2==true) System.out.println("valid");
		else System.out.println("Not valid");

	}

}
