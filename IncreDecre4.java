package programs;

public class IncreDecre4 {

	public static void main(String[] args) {
		float f=10.4f;
		f++;
		System.out.println(f);
		
		char c='A';
		c++;
		System.out.println(c);
		
		byte b=15;
		b++; /* b=b+1 -->  not correct because here 1 is int literals and b is byte datatype */
        System.out.println(b);
        
        int i=65;  /*  tried type casting */
        char u=(char)i;
        System.out.println(u);
	}

}
