package programs;

public class GCDofMoreThan2Nums {
	static int gcd(int a,int b) {
		if(a==0) {
			return b;
		
		}
		return gcd(b%a,a);
	}
	static int findGcd(int arr[]) {
		int result=0;
		for(int x:arr) {
			result=gcd(result,x);
		}
		if(result==1) {
			return 1;
		}
		return result;
	}

	public static void main(String[] args) {
		
		
		int ar[]= {3,6,9,12};
		//int len=ar.length;
		System.out.println(findGcd(ar));

	}

}
