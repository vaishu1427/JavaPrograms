package programs;
public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		for(int i=0;i<a.length;i++) {
			System.out.println("a= "+a[i]);
		}
		System.out.println();
		System.out.println();
		int b[]= {1,2,3,4,5};
		for(int i=0;i<b.length;i++) {
			System.out.println("b="+b[i]);
		}
		for(int i=0;i<a.length;i++) {
			System.out.println("a1 = "+(a[i]=i));
		}
		

	}

}
