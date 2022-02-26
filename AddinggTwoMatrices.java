package programs;

public class AddinggTwoMatrices {

	public static void main(String[] args) {
		int arr1[][]= {{1,2,3},{3,4,5},{1,3,4}};
		int arr2[][]= {{3,4,6},{1,2,3},{3,4,5}};
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[0].length;j++) {
				System.out.print((arr1[i][j]+arr2[i][j])+" ");
			}
			System.out.println();
		}

	}

}
