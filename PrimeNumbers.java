package programs;
import java.util.Scanner;
public class PrimeNumbers {
	static boolean isPrime(int n) {
		if(n==0|| n==1) {
			return false;
		}
		else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					return false;
				}
			}
		}
	return true;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}

	}
	/*static boolean isPrime(int n){
        
        if(n==1||n==0)return false;
 
        //Run a loop from 2 to n-1
        for(int i=2; i<n; i++){
          // if the number is divisible by i, then n is not a prime number.
              if(n%i==0)return false;
        }
        //otherwise, n is prime number.
        return true;
  }
   

  // Driver code
  public static void main (String[] args)
  {
	  Scanner sc=new Scanner(System.in);
      int N = sc.nextInt();
      //check for every number from 1 to N
      for(int i=1; i<=N; i++){
          //check if current number is prime
          if(isPrime(i)) {
              System.out.println(i + " ");
          }
      }

  }*/


}
