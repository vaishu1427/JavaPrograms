package programs;
import java.util.Scanner;

public class ReversingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String s="";
        while(a>0){
            int r=a%10;
            s=s+r;
            
            a=a/10;
        }
        System.out.println(s);
	}

}
