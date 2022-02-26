package programs;

public class TwoDimentionalArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Accessing the two dimentional matrix's values using FOR LOOP 
		int A[][]= {{1,2,3},{2,4,6},{7,8,9}};
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A[0].length;j++) {
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}

	}

}
