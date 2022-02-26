package programs;
import java.util.Scanner;
public class BinaryToDecimal1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0;
		String s=""+a;
		if(s.matches("[01]+")==true){
			int j=0;
			for(int i=s.length()-1;i>=0;i--){ //changes
				if(s.charAt(i)=='1'){
					sum=sum+(int)Math.pow(2,j);
					j++;
				}
				else if(s.charAt(i)=='0'){
					j++;
				}
			}
			System.out.println(sum);
		}
		sc.close();
	}
}