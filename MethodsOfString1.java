package programs;

public class MethodsOfString1 {

	public static void main(String[] args) {
		String s="Hello Guys";
		int len=s.length();    // gives the length of the string 
		System.out.println(len);
		
		String low=s.toLowerCase();  // gives the entire string in lower case
		System.out.println(low);
		
		String up=s.toUpperCase();   // gives the entire string in upper case
		System.out.println(up);
		  
		
		String s1="   Hello  Guys   ";  // It will remove the white spaces which is present before and after the String 
		String tr=s1.trim();
		System.out.println(tr);
		
		String rep=s.replace('l','K');  // Replaces the old character with the new character
		System.out.println(rep);
	}

}
