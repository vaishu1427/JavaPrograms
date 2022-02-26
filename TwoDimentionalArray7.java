package programs;

public class TwoDimentionalArray7 {

	public static void main(String[] args) {
		
		//Jagged Array --> 2
		
		//Different types of initialization of jagged array
		int arr1[][]=new int[][] {{1,2,3},{3,4},{5,6,7}};
		int arr2[][]=new int[][] {new int[] {1,2,3},new int[] {2,4},new int[] {1,6,7}};
		int arr3[][]= {new int[] {1,2,3},new int[] {2,4},new int[] {3,6,9}};
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}

	}

}
