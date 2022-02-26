package programs;
import java.util.Scanner;
public class Pattern12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1,k=1;j<=a;j++){
                if(i+j<a+1){
                    System.out.print(" ");
                }
                else if(i+j>=a+1){
                    System.out.print(k);
                    k++;
                }
            }
            System.out.println();
        }


	}

}
