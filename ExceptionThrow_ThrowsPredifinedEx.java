package programs;

public class ExceptionThrow_ThrowsPredifinedEx {
	static int area(int l,int b) throws Exception {
		if(l<0 || b<0) {
			throw new Exception("Dimensions cannot be negative ");
		}
		int a=l*b;
		return a;
	}
	static void meth1() {
		try {
		int r=area(-10,5);
		
		System.out.println(r);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		meth1();

	}

}