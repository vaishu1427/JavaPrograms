package programs;

public class StringConstructors1 {

	public static void main(String[] args) {
		String s="Hello World";
		System.out.println(s);
		
		char c[]= {'a','b','c','d'};
		String str1=new String(c);
		System.out.println(str1);
		
		byte b[]= {97,98,99,100};
		String str2=new String(b);
		System.out.println(str2);
		
		// Two more constructors for String 
		
		char d[]= {'a','b','c','d'};
		String str3=new String(d,1,2);  // Here 2nd position indicates starting index and 3rd position indicates no. of positions to print.
		System.out.println(str3);
		
		byte e[]= {97,98,99,100};
		String str4=new String(e,0,3);  // Here 2nd position indicates starting index and 3rd position indicates no. of positions to print.
		System.out.println(str4);
		
		
		
	}

}
