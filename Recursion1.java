package programs;

public class Recursion1 {
	static void fun(int a) {
		if(a>0) {
			System.out.println(a);
			fun(a-1);
		}
	}

	public static void main(String[] args) {
		fun(3);

	}

}
