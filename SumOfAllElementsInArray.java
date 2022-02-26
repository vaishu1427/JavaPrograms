package programs;

public class SumOfAllElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A=new int[5];
		
		int c=3;
		int sum=0;
		for(int i=0;i<A.length;i++) {
			
			A[i]=c;
			System.out.println(A[i]);
			c++;
			sum=sum+A[i];
		}
		System.out.println(sum);
		
		/*Using for each loop
		
		int sum=0;
		int A[]={1,2,3,4,5};
		for(int x:A){
		    
		    sum=sum+x;
	    }
		System.out.println(sum);*/
		

	}

}
