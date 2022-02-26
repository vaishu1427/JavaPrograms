package programs;
import java.util.Scanner;
public class SwapAlternateNumbers {

	public static void swapAlternate(int arr[]) {
        int temp;
    	for(int i=0;i<arr.length-1;i=i+2){
            temp=arr[i+1];
            arr[i+1]=arr[i];
            arr[i]=temp;
        }
    	for(int x:arr) {
    		System.out.print(x+" ");
    	}
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            int num=sc.nextInt();
            int arr1[]=new int[num];
            for(int j=0;j<num;j++){
                arr1[j]=sc.nextInt();
            }
            swapAlternate(arr1);
        }
    }

}
