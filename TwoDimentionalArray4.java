package programs;

public class TwoDimentionalArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Accessing the two dimentional matrix's values using FOR EACH LOOP 
		
		int A[][]= {{1,2,3},{2,4,6},{7,8,9}};
		for(int x[]:A) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}

	}

}
