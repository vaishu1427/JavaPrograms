package programs;

public class ProgramUsingRegexAndMethods {

	public static void main(String[] args) {
		String str="programmer@gmail.com";
		boolean validity=str.matches("[a-z]*@.*");
		System.out.println(validity);
		int i=str.indexOf("@");
		String FirstStr=str.substring(0,i);
		System.out.println(FirstStr);
		String SecondStr=str.substring(i+1);
		System.out.println(SecondStr);
		System.out.println(str.contains("gmail"));
		
		/* String str="programmer@gmail.com";
           //String str="programmer@hotmail.com";
      
           int i=str.indexOf("@");
           String uname=str.substring(0,i);
           String domain=str.substring(i+1, str.length());
      
           System.out.println("Username :"+uname);
           System.out.println("Domain :"+domain);
      
           int j=domain.indexOf(".");
           String name=domain.substring(0, j);
           System.out.println(name.equals("gmail")); */
	}

}
