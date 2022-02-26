package programs;

public class TwoDimentionalArray6 {

	public static void main(String[] args) {
		
		// JAGGED ARRAY --> 1
		//Accessing using for each loop
		
		int A[][];
		A=new int[3][];
		A[0]= new int[2];
		A[1]=new int[3];
		A[2]=new int[4];
		for(int x[]:A) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		

	}

}
