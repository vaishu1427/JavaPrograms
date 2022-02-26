package programs;

public class Printing {

	public static void main(String[] args) {
		int a=20;
		long l=20l;
		float f=10.5f;
		String str ="Hello";
		System.out.println(a);
		System.out.println(l);
		System.out.println(f);
		System.out.println(str); /* Println()  method is printing all types of data(datatypes) */
		
		System.out.println("hello "+a+a); /* Here the concatenation done first */
		
		System.out.println("Hello "+(a+a)); // Here the calculation is done first because of bracket() 
		
		System.out.println(a+a+"Hello");  // Here the calculation is done first and then concatenation with the string.

		
		System.out.println("Sum of "+a+" and "+a+" is "+(a+a));

	}

}
