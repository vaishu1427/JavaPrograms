package programs;

public class VariableArgument4 {
	static void test(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		test(new int[] {1,2,3,4,5});
		test(null);                           //When we are passing the empty array to the method means we should specify it as NULL .otherwise it shows the error .

	}

}
