package programs;

public class MethodsOfString3 {

	public static void main(String[] args) {
		 
		String s1="Java";
		String s2="Java";
		String s3="java";
		String s4="python";
		String s5="cat";
		String s6=new String("Java");
		String s7="I am Vaishu ";
		
		// boolean equals(String s)
		 
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));
		
		// boolean equalsIgnoreCase(String s)
		
		System.out.println(s2.equalsIgnoreCase(s3));
		
		// int compareTo(String s)
		
		System.out.println(s2.compareTo(s3));
		System.out.println(s3.compareTo(s2));
		System.out.println(s4.compareTo(s3));
		
		// int compareToIgnoreCase(String s)
		
		System.out.println(s2.compareToIgnoreCase(s3));
		System.out.println(s3.compareToIgnoreCase(s5));
		System.out.println(s5.compareToIgnoreCase(s3));
		
		// boolean contains(String s)
		
		System.out.println(s7.contains("Vaishu"));
		System.out.println(s7.contains("e"));
		
		//String concat(String s)
		
		System.out.println(s7.concat(s5));
		System.out.println(s7 + s5);        // '+' is for concatenation
		
		// Difference between equals and ==
		
		System.out.println(s1.equals(s2));  // checks the content  --> equals
		System.out.println(s1==s2);         // checks the reference --> '=='
		System.out.println(s1==s6);
		
		//String valueOf(int/float/double/float etc)
		
		int i=65;
		char j='v';
		char l[]= {65,66,67,68};
		char n[]= {'j','a','v','a'};
		String s=String.valueOf(i);
		System.out.println(s);
		String g=String.valueOf(j);
		System.out.println(g);
		String m=String.valueOf(l);
		System.out.println(m);
		String o=String.valueOf(n);
		System.out.println(o);
		
		
		

	}

}
