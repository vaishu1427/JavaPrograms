package programs;

public class SwappingUsingXOR {

	public static void main(String[] args) {
		int a=10,b=20;
		/*int a=0b1010,b=0b10100;*/
		System.out.println(a+" "+" "+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a+" "+" "+b);

	}

}
