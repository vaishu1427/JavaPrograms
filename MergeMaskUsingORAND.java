package programs;

public class MergeMaskUsingORAND {

	public static void main(String[] args) {
		byte a=9,b=12;
		byte c;
		c=(byte)(a<<4);
		System.out.println(c);/* ()  came because of << <--- least precedence  */
		//c=(byte)(c|b);
		System.out.println(Integer.toBinaryString(c));
		System.out.println((c&0b11110000)>>4);           /* or and shift ---> STORING */
		System.out.println((c&0b00001111));              /* and and shift ---> RETRIEVE */
		

	}

}
