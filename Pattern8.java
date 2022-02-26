package programs;
import java.util.Scanner;
public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				if(i+j>a) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			for(int j=1;j<=a;j++) {
				if(j>=i && i==j) {
					System.out.print("  ");
				}
				else if(j<=i){
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				
				if(j>=i){
					System.out.print("* ");
				}
				else if(j<=i){ 
					System.out.print("  ");
				}
			}
			for(int j=1;j<=a-i;j++) {
				if(j<=a){
					System.out.print("* ");
				}
				else if(j>a && i==j){ 
					System.out.print("  ");
				}
				
			}
			System.out.println();
			
		}
		/*for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				if(j>=i){
					System.out.print("* ");
				}
			}
			for(int j=1;j<=a;j++) {
				if(j>=i && i==j) {
					System.out.print(" ");
				}
				else if(j<=i){
					System.out.print("* ");
				}
			}
			System.out.println();*/
		

	}

}
