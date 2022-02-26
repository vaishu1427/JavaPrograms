package programs;
import java.util.Scanner;
public class PopulatingSum {
	public static void arrange(int[] arr, int n) {
    	
        for(int i=0;i<n;i++){
            arr[i]=n;
        }
        for(int i=0;i<n/2;i++){
            arr[i]=2*i+1;
            arr[n-1-i]=2*i+2;
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int a=sc.nextInt();
            int arr[]=new int[a];
            arrange(arr,a);
        }
    }
}
