package programs;
class NegativeDimensionException extends Exception{
	public String toString() {
		return "Dimension should not be negative ";
	}
}
public class ExceptionThrow_ThrowsOwnEx1 {
	static int area(int l,int b) throws NegativeDimensionException{
		if(l<0 || b<0) {
			throw new NegativeDimensionException();
		}
		int a=l*b;
		return a;
	}
	static void meth1() {
		try {
		int r=area(-10,5);
		System.out.println(r);
		}
		catch(NegativeDimensionException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		
		meth1();
		
	}

}
