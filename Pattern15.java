package programs;

import java.util.Scanner;
public class Pattern15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==j){
                    System.out.print("*");
                }
                else if(i>j){
                    System.out.print("0");
                }
            }
             for(int j=1;j<=n;j++){
                /*if(i==j){
                    System.out.print("*");
                }*/
                if(i<j){
                    System.out.print("0");
                }
            }
            for(int j=1;j<=n;j++){
                if(i>=n && j==1){
                    System.out.print("*");
                }
                if(i+j==n){
                    System.out.print("*");
                }
                /*else if(i+j<=n){
                    System.out.print("0");
                }*/
            }
            for(int j=1;j<n;j++){
                if(i+j<=n){
                    System.out.print("0");
                }
            }
            for(int j=1;j<=n;j++){
                if(i+j==n+1){
                    System.out.print("*");
                }
                else if(i+j>n+1){
                    System.out.print("0");
                }
            }
            System.out.println();
        }
	}
}


