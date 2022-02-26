package programs;

public class VariableArguments2 {
	static void showList(String...s) {       // Passing the variable argument
		for(int i=0;i<s.length;i++) {
			System.out.println(i+" "+s[i]);
		}
		/*for(String x:s) {
			System.out.println(x);
		}*/
	}

	public static void main(String[] args) {
		showList("Apple","Orange","Pine","Sapota");
	}

}
