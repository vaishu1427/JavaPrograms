package programs;

public class Method4 {
	static  void update(int a[],int index,int value) {  
		System.out.println(a[index]=value);     // Here when the object is passed , the reference is passed . so the actual parameter is changed
	}
	static int update2(int y,int value) {
		return (y=value);
	}

	public static void main(String[] args) {
		int a[]= {2,3,4,5};
		update(a,2,3);                          // Here when the primitive datatype is passed , the actual parameter is not changed only the formal parameter is changed
		int y=10;
		System.out.println(update2(y,5)+" " + y);
		for(int x:a) {
			System.out.print(x+" ");
		}

	}

}
