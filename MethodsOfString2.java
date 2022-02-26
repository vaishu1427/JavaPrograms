package programs;

public class MethodsOfString2 {

	public static void main(String[] args) {
		String s ="www.google.com";
		
		// boolean startsWith(String s)
		boolean a=s.startsWith("www.");
		System.out.println(a);
		
		// boolean endsWith(String s)
		
		boolean b=s.endsWith("m");
		System.out.println(b);
		
		boolean c=s.startsWith("g",7);  // specifying the starting point to search
		System.out.println(c);
		
		// char charAt(int index)
		
		char d=s.charAt(3);
		System.out.println(d);
		
		// int indexOf(String / char s);   --> search from the left to right
		
		int e=s.indexOf("www");
		System.out.println(e);
		
		int f=s.indexOf('e');
		System.out.println(f);
		
		int g=s.indexOf("o",9);     // specifying the starting point to search
		System.out.println(g);

		// int lastIndexOf(String / char s)  --> search from the right to left
		
		int h=s.lastIndexOf("c");
		System.out.println(h);
		
		int i =s.lastIndexOf("o",11);
		System.out.println(i);
		
		int j=s.lastIndexOf("?");
		System.out.println(j);  // Gives -1 if the string or char is not found
	}

}
