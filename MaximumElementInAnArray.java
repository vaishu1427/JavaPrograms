package programs;

public class MaximumElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {400,8,9,200,20,80,34,8};
		int j=0;
		int max=a[j];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);

	}

}
