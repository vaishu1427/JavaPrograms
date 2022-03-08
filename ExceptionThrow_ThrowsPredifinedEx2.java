package programs;

public class ExceptionThrow_ThrowsPredifinedEx2 {
	static int area(int l,int b) throws Exception {
		if(l<0 || b<0) {
			throw new Exception("Dimensions cannot be negative ");
		}
		int a=l*b;
		return a;
	}
	static void meth1() throws Exception {
		
		int r=area(-10,5);
		
		System.out.println(r);
		
	}

	public static void main(String[] args)  {
		try {
			meth1();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}