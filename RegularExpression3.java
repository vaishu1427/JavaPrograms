package programs;

public class RegularExpression3 {

	public static void main(String[] args) {
		
		// Quantifiers  -->  +,*,?,{X},{X,Y}
		
		String s="john";
		String s1="w2w9n";
		String s2="aabbcgdy";
		String s3="aabbcgd@y";
		
		System.out.println(s.matches(".*"));
		System.out.println(s1.matches("\\w*"));
		System.out.println(s2.matches("[a-z]{0,10}"));
		System.out.println(s3.matches("[a-z]{0,10}"));

	}

}
