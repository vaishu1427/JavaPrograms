package programs;

public class FormatSpecifier3 {

	public static void main(String[] args) {
		// int
		int a=10;
		int b=-20;
		System.out.printf("%6d\n",a);
		System.out.printf("%-6d\n",a);
		System.out.printf("%06d\n",a);
		System.out.printf("%+6d\n",a);
		System.out.printf("%-+6d\n",a);
		System.out.printf("%+6d\n",b);
		System.out.printf("%(6d\n",b); //if the number is minus ,it will print the bracket
		System.out.printf("%(6d\n",a); // if the number is plus means ,it will not print the bracket
		
		//float
		float f=12.45f;
		float g=3.45f;
		System.out.printf("%f\n",f);
		System.out.printf("%6.3f\n", f);
		System.out.printf("%6f\n",g);
		System.out.printf("%06.2f\n", g);
		
		//String
		String str="Hello";
		System.out.printf("%20s\n", str);
		System.out.printf("%-20s\n", str);
	}

}
