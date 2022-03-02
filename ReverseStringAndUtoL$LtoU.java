package programs;
import java.util.Scanner;
public class ReverseStringAndUtoL$LtoU
{
    static void reverse(String s){
        String a[]=s.split("\\s");
        for(int j=a.length-1;j>=0;j--){
            
            String fs=a[j];
            
            for(int i=0;i<fs.length();i++){
                char I=fs.charAt(i);
                if(Character.isUpperCase(I)==true){
                    System.out.print(Character.toLowerCase(I));
                }
                else{
                    
                    System.out.print(Character.toUpperCase(I));
                }
            }
            System.out.print(" ");
        }
        
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		reverse(s);
	}
}
