package programs;

public class RegularExpression2 {

	public static void main(String[] args) {
		
		// Meta Characters 
		  
		/* \d - digits 
		   \D - Not digits
		   \s - Space
		   \S - Not space 
		   \w - Alphabets or digits
		   \W - Neither alphabets or digits */
		
		
		String s1="2";
		String s2="$";
		String s3="A";
		String s4=" ";
		System.out.println(s1.matches("\\d"));
		System.out.println(s2.matches("\\d"));
		System.out.println(s3.matches("\\d"));
		System.out.println(s1.matches("\\D"));
		System.out.println(s2.matches("\\D"));
		System.out.println(s3.matches("\\D"));
		System.out.println(s4.matches("\\s"));
		System.out.println(s1.matches("\\S"));
		System.out.println(s2.matches("\\S"));
		System.out.println(s3.matches("\\w"));
		System.out.println(s1.matches("\\w"));
		System.out.println(s2.matches("\\W"));
		
		
		

	}

}
