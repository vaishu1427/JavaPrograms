package programs;

public class FormatSpecifier2 {

	public static void main(String[] args) {
		int a=10;
		float f=12.56f;
		String s="Hello";
		System.out.printf("%1$f %2$s %3$d %1$f",f,s,a);  // ARGUMENT INDEX
	}

}
