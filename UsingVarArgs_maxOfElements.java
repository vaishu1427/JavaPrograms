package programs;

public class UsingVarArgs_maxOfElements {
	static int max(int...a) {
		if(a.length==0) {
			return Integer.MIN_VALUE;
		}
		int m=a[0];
		for(int i=1;i<a.length;i++) {
			
			if(a[i]>m) {
			    m=a[i];
			}
		}
		return m;
	}

	public static void main(String[] args) {
		System.out.println(max());
		System.out.println(max(2,34));
		System.out.println(max(2,34,45,5,55));

	}

}
