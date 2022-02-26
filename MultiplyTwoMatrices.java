package programs;

public class MultiplyTwoMatrices {

	public static void main(String[] args) {
		int[][] a= {{1,2,3},{1,2,3},{1,2,3}};
		int[][] b= {{1,2,3},{1,2,3},{1,2,3}};
		int[][] c=new int[3][3];
	
		
		// For loop
		
		 if(a.length==b[0].length) {
			 for(int i=0;i<a.length;i++) {
				 for(int j=0;j<a[0].length;j++) {
					 int sum=0;
					 c[i][j]=0;
					 for(int k=0;k<a.length;k++) {
						 c[i][j]=a[i][k]*b[k][j];
						 sum=sum+c[i][j];
						 
					 }
					 c[i][j]=sum;
					 
				 }
			 }
			 for(int x[]:c) {
				 for(int y:x) {
					 System.out.print(y+" ");
				 }
				 System.out.println();
			 }
		 }
		 else {
			 System.out.println("Invalid input");
		
		// For each loop
		
		
		/*for(int x[]:a) {
			for(int y:x) {

				System.out.print(y+" ");
			}
			System.out.println();*/
		}

	}

}
