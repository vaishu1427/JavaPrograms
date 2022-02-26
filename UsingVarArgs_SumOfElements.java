package programs;

public class UsingVarArgs_SumOfElements {
	static int sum(int...a) {
		int sum1=0;
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i];
		}
		return sum1;
	}

	public static void main(String[] args) {
		System.out.println(sum());
		System.out.println(sum(10,20));
		System.out.println(sum(10,20,30));
		System.out.println(sum(new int[] {10,20,30,40}));

	}

}
