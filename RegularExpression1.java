package programs;

public class RegularExpression1 {

	public static void main(String[] args) {
		// "."  ---> Single characters 
		
		String s1="s";
		String s2="%";
		String s3="9";
		String s4="abc";  // multiple characters should not give 
		System.out.println(s1.matches("."));
		System.out.println(s2.matches("."));
		System.out.println(s3.matches("."));
		System.out.println(s4.matches("."));
		
		// "[abc]"    ---> Single characters 
		
		String s5="a";
		String s6="%";
		String s7="9";
		String s8="abc";  // multiple characters should not give 
		System.out.println(s5.matches("[abc]"));
		System.out.println(s6.matches("[abc]"));
		System.out.println(s7.matches("[abc]"));
		System.out.println(s8.matches("[abc]"));
		
		// "[a-z0-9]"   ---> Single characters
		
		String s9="a";
		String s10="%";
		String s11="9";
		String s12="abc";
		String s13="a9";   // multiple characters should not give 
		System.out.println(s9.matches("[a-b0-9]"));
		System.out.println(s10.matches("[a-b0-9]"));
		System.out.println(s11.matches("[a-b0-9]"));
		System.out.println(s12.matches("[a-b0-9]"));
		System.out.println(s13.matches("[a-b0-9]"));
		
		// "[a-z][0-9]"  ---> Multiple characters
		
		String s14="a";
		String s15="%";
		String s16="9";
		String s17="abc";
		String s18="a9";   
		System.out.println(s14.matches("[a-z][0-9]"));
		System.out.println(s15.matches("[a-z][0-9]"));
		System.out.println(s16.matches("[a-z][0-9]"));
		System.out.println(s17.matches("[a-z][0-9]"));
		System.out.println(s18.matches("[a-z][0-9]"));
		
		// "[abc][vz]"  ---> Multiple characters 
		
		String s19="a";
		String s20="%";
		String s21="9";
		String s22="av";
		String s23="AZ";   
		System.out.println(s19.matches("[abc][vz]"));
		System.out.println(s20.matches("[abc][vz]"));
		System.out.println(s21.matches("[abc][vz]"));
		System.out.println(s22.matches("[abc][vz]"));
		System.out.println(s23.matches("[abc][vz]"));
		
		// "[^abc]"  ---> true if it is except this 3 alphabets
		
		String s24="v";
		String s25="a";
		System.out.println(s24.matches("[^abc]"));
		System.out.println(s25.matches("[^abc]"));
		 
		// "a|b";  ---> whether a or b
		
		String s26="v";
		String s27="a";
		System.out.println(s26.matches("a|b"));
		System.out.println(s27.matches("a|b"));
		
		// "vs"  ---> it should be exactly like this 
		
		String s28="v";
		String s29="a";
		String s30="vs";
		String s31="va";
		System.out.println(s28.matches("vs"));
		System.out.println(s29.matches("vs"));
		System.out.println(s30.matches("vs"));
		System.out.println(s31.matches("vs"));
		
		 
	}

}
