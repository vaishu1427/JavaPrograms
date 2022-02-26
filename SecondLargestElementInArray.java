package programs;

import java.util.Arrays;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,19,18,8,9,15,12,8};
		int max1=a[0];
		int max2=0;
		for(int i=1;i<a.length;i++) {
			if(a[i]>max1) {
				max2=max1;
				max1=a[i];
			}
			else{
				if(a[i]>max2) {
					max2=a[i];
				}
			}
		}
		System.out.println("The second largest element is : "+max2);
		
		
		
		/*Arrays.sort(a);
		System.out.println(a[a.length-2]);*/
		
		
		/*public class SCArray1 
         {
    
          public static void main(String[] args) 
          {
        int A[]={3,9,7,8,12,6,15,5,4,10};
        int max1,max2;
        
        max1=max2=A[0];
        
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max1)
            {
                max2=max1;
                max1=A[i];
                
            }
            else if(A[i]>max2)
            {
                max2=A[i];
            }
        }
        
        System.out.println("Second Largest is "+max2);
        
        }*/
    
    
    

	}

}
