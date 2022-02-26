package programs;

public class ProgramUsingRegex {

	public static void main(String[] args) {
		
		// Binary number or not
		
		int i=10010101;
		String s=i+"";  //String s=String.valueOf(i);
		System.out.println(s.matches("[01]+"));
		
		// Hexadecimal or not 
		
		
		String l="A87";
		System.out.println(l);
		System.out.println(l.matches("[A-F0-9]+"));
		
		// date or not
		
		String date="01/12/2000";
		System.out.println(date.matches("[0-3][0-9]/[1][0-2]/[1-2][0-9]{3}"));
	}
	

}
