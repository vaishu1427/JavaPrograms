package programs;

public class ReverseCopyingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int b[]=new int[10];
		/*System.out.println("Before reversing : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		
		for(int i=a.length-1;i>=0;i--) {
			b[(a.length)-(i+1)]=a[i];
		}
		
		 
		System.out.println();
		System.out.println("After reversing : ");
		
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}*/
		for(int i=a.length-1,j=0;i>=0;i--,j++) {
			b[j]=a[i];
		}
		for(int j=0;j<=b.length-1;j++) {
			System.out.print(b[j]+" ");
		}
		

	}

}
