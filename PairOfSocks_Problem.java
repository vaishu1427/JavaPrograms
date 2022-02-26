package programs;
import java.util.*;
public class PairOfSocks_Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int arr[]=new int[a];
	    int count=0;
	    for(int i=0;i<a;i++){
	        arr[i]=sc.nextInt();
	    }
	    
	    Arrays.sort(arr);
	    for(int x:arr) {
	    	System.out.print(x+" ");
	    	
	    }
	    System.out.println();
	    for(int i=1;i<arr.length;)
	    {
	        if(arr[i-1]==arr[i]){
	            count++;
	            i=i+2;    
	        }
	        else {
	        	i++;
	        }
	    }
	    
	    System.out.println(count);

	}

}
