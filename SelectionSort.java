package programs;
import java.util.Scanner;
public class SelectionSort {

	public static void selectionSort(int[] arr) {
    	
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp;
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
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
		selectionSort(arr);
	}
}
