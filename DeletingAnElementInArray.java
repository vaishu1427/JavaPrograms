package programs;

public class DeletingAnElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[10];
		a[0]=3;
		a[1]=5;
		a[2]=7;
		a[3]=2;
		a[4]=8;
		a[5]=6;
		int in=3;
		//int temp=a[in]; Even if we didn't specify it works .
		int num=6;
		System.out.print("Before deletion : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
		System.out.println();
		for(int i=in;i<=num;i++) {
			a[i]=a[i+1];
		}
		System.out.println();
		System.out.print("After deletion : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
		System.out.println();

	}

}
