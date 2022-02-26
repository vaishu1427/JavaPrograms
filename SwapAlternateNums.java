package programs;
import java.util.*;
public class SwapAlternateNums {

	public static void swapAlternate(int arr[]) {
        int temp;
    	for(int i=0;i<arr.length-1;){
            if(arr[i]==arr[i+1]) {
            	
            	i=i+2;
            }
            else if(arr[i]!=arr[i+1]){
            	i++;
            	System.out.println(arr[i]);
            	break;
            	
            }
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
            Arrays.sort(arr1);
            swapAlternate(arr1);
        }
    }
}
