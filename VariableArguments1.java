package programs;

//Variable Arguments

public class VariableArguments1 {
	static void  show(int...x) {
		for(int a:x) {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		show();
		show(10);
		show(10,20);
		show(10,20,30);
		show(new int[] {10,20,30,40});

	}

}
