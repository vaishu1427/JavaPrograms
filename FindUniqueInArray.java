package programs;

import java.util.Scanner;

public class FindUniqueInArray {	

		public static int findUnique(int[] arr){
	        int i,j,c;
	        for(i=0;i<arr.length;i++){
	            c=0;
	            for(j=0;j<arr.length;j++){
	                if(arr[i]==arr[j])
	                    c++;
	            }
	            if(c==1)
	            {
	                return arr[i];
	            }
	        }
	        return 0;

		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
	        int a=sc.nextInt();
	        for(int i=1;i<=a;i++){
	            int num=sc.nextInt();
	            int arr1[]=new int[num];
	            for(int j=0;j<num;j++){
	                arr1[j]=sc.nextInt();
	            }
	            System.out.println(findUnique(arr1));
	        }
		}
	
}
