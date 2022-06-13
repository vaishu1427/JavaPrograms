package programs;
import java.util.Scanner;
public class BubbleSort {

	public static void bubbleSort(int[] arr) {
    	for(int i=0;i<arr.length-1;i++){
    	    for(int j=0,k=j+1;j<arr.length-1;){
    	        if(arr[k]<arr[j]){
    	            int temp;
    	            temp=arr[j];
    	            arr[j]=arr[k];
    	            arr[k]=temp;
    	            j++;
    	            k++;
    	        }
    	        else{
    	            j++;
    	            k++;
    	        }
    	    }
    	    
    	    
    	}
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }   
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int m=0;m<a;m++){
		    arr[m]=sc.nextInt();
		}
		bubbleSort(arr);
	}
}
