package programs;

public class Method2 {
	// Object as parameter
    static void update(int a[]) {
		a[0]=25;
		System.out.println(a[0]);
	}

	public static void main(String[] args) {
		
		
		int a[]= {2,3,4,5,6};
		update(a);
		System.out.println(a[0]);
		for(int x:a) {
			System.out.print(x+" ");
		}

	}

}
