package programs;
import java.util.Scanner;
public class SearchingOfKeyInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a key number to search:");
		int key=sc.nextInt();
		int A[]= {1,4,6,5,2,9};
		for(int i=0;i<A.length;i++) {
			if(A[i]==key) {
				System.out.println("Key is found in the index : "+i);
				System.exit(0);  // to exit we use this .
			}
		}
		System.out.println("key is not found in the array");
	}
}
