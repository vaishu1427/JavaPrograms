package programs;
import java.util.Scanner;
public class Series_3NPlus2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n=1;
        int count =0;
        while(count<a){
            int s=3*n+2;
            if(s%4!=0){
                System.out.print(s+" ");
                count++;
            }
          n++; 
        }

	}

}
