package programs;


public class ProgramUsingRegex2 {
	public static void main(String[] args) {
		
		// Remove special characters in a string
		
		String str1="ffy7%#";
		String a=str1.replaceAll("\\W", "");
		System.out.println(a);
		
		//Remove white spaces from  the string 
		
		String str2=" I am Vaishu from cse  c  ";
		String b=str2.replaceAll("\\s", "");
		System.out.println(b);
		
		//To find out the number of words in a string 
		
		String str3="  I am Vaishu    hshg";
		String str4=str3.replaceAll("\\s", " ").trim();
		String words[]=str4.split("\\s");
		int i=words.length;
		System.out.println(i);

	
	
	}
}
	


