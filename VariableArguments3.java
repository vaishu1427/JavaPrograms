package programs;

public class VariableArguments3 {
	static void showList(int a,String...S) {
		for(int i=0;i<S.length;i++) {
			System.out.println(a+".  "+S[i]);
			a++;
		}
	}

	public static void main(String[] args) {
		/*public static void main(String[] args)
		  public static void main(String  [] args)
		  public static void main(String []args)
		  public static void main(String args[])
		  public static void main(String...args)   variable argument is also allowed in main method*/
		
		showList(5,"Apple","Orange","Pine","Berry");

	}

}
