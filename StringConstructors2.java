package programs;

public class StringConstructors2 {

	public static void main(String[] args) {
		String s1="Hello World"; // object created in pool
		String s2="Hello World"; // object created in pool
		System.out.println(s1==s2);
		
		String s3="Hello"; // object created in pool
		String s4=new String("Hello"); // object created in heap
		System.out.println(s3==s4);

	}

}
