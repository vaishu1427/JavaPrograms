package programs;

public class CommandLineArgs2 {

	public static void main(String[] args) {    //whatever we pass it will take it as a string and it will store as an array.we can access with help of for and for each loop. 
		for (int i=0;i<args.length;i++) {
			System.out.print(args[i]+" ");
		}

	}

}
