package programs;

public class IncreasingTheSizeOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int b[]=new int[2*a.length];
		for(int i=0,j=0;i<a.length;i++,j++) {
				b[j]=a[i];
		}
		a=b;
	    for(int i=0;i<a.length;i++) {
	    	System.out.print(a[i]+" ");
	    }

	}

}
