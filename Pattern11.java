package programs;
import java.util.Scanner;
public class Pattern11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=64+a;

        for(int i=1;i<=a;i++){
        	
            for(int j=1,temp=b;j<=i;j++){
                System.out.print((char)temp);
                temp++;
            }
            b--;
            System.out.println();
        }

	}

}
