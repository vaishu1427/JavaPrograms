package programs;

public class RotatingAnArray {

	public static void main(String[] args) {
		// LEFT ROTATION OF AN ARRAY
		int[] A= {7,8,4,3,2,1};
		int temp=A[0];
		for(int i=1;i<A.length;i++) {
			A[i-1]=A[i];
		}
		A[A.length-1]=temp;
		for(int x:A) {
			System.out.print(x+" ");
		}
		


	}

}
