package programs;

public class CopyingAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int b[]=new int[10];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		System.out.println("Array A");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Array B");
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}

	}

}
