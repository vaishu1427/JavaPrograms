package programs;
class NegativeDimension extends Exception{
	public String toString() {
		return "Dimension should not be negative ";
	}
}
public class ExceptionThrow_ThrowsOwnEx1 {
	static int area(int l,int b) throws NegativeDimension{
		if(l<0 || b<0) {
			throw new NegativeDimension();
		}
		int a=l*b;
		return a;
	}
	static void meth1() {
		try {
		int r=area(-10,5);
		System.out.println(r);
		}
		catch(NegativeDimension e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		
		meth1();
		
	}

}
