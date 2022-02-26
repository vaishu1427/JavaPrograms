package programs;
import java.util.Scanner;
public class Pattern14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                if(i+j<a+1){
                    System.out.print(" ");
                }
                else if(i+j>=a+1){
                    System.out.print("*");
                }
            }
            for(int k=1;k<=a-1;k++) {
            	if(i>k) {
            		System.out.print("*");
            	}
            	else if(i<=k) {
            		System.out.print(" ");
            	}
            }
            System.out.println();
        }

	}

}
