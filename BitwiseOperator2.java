package programs;
import java.util.Scanner;
public class BitwiseOperator2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int a1=1;
        int a2=1;
        int s=0;
		while(a>0){
            s=a1+a2;
            a2=s;
            a1=a2;
            
            
        }
        System.out.println(s);


	}

}
