package programs;

public class UsingCommandLineArgs_FindSum {

	public static void main(String[] args) {
		double sum=0;
		for(int i=0;i<args.length;i++) {
			if(args[i].matches("[0-9\\.]+")) {    //checks whether the coming one is number or not .
				sum=sum+Double.parseDouble(args[i]);   //Double.parseDouble method will convert the string into double
		    } 
		}
		System.out.println(sum);

	}

}
