package programs;

public class BitwiseOperation2 {

	public static void main(String[] args) {
		/* left shift */
		
		int x=10,y;
		y=x<<1;
		System.out.println(y);
		
		/* right shift */
		
		y=x>>1;
		System.out.println(Integer.toBinaryString(y));
		 
		/* representing in binary digit */
		
		int a=0b1001;
		int b=a<<1;
		System.out.println(b);
		
		int l=-10;
		int m=l>>>1;
		System.out.println(m);
		
		int e=10;
		int j=~e;
		System.out.println(Integer.toBinaryString(j));
	}

}
