package programs;

public class InsertingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[10];
		a[0]=3;
		a[1]=5;
		a[2]=7;
		a[3]=2;
		a[4]=8;
		a[5]=6;
		int el=4;
		int in=3;
		int num=6;
		System.out.print("Before insertion : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
		System.out.println();
		for(int i=num;i>=in;i--){
			a[i+1]=a[i];
		}
		a[in]=el;
		for(int i=0;i<=num;i++) {
			System.out.print(a[i]+",");
		}
		System.out.println();
		System.out.print("After insertion : ");
		for(int i=0;i<a.length;i++) {
			
			System.out.print(a[i]+",");
		}

	}

}
