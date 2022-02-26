package programs;

public class Recursion2 {
	static void fun(int a) {
		if(a>0) {
			fun(a-1);
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		fun(3);
	}

}
