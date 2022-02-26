package programs;
import java.util.Scanner;
public class RemoveConsecutiveDuplicates2
{
    public static String removeConsecutiveDuplicates(String str) {
        String fword="";
        for(int i=1;i<str.length();){
            if(str.charAt(i-1)==str.charAt(i)){
                i++;
            }
            else{
                fword=fword+str.charAt(i-1);
                //System.out.println(fword);
                i++;
            }
        }
        fword=fword+str.charAt(str.length()-1);
        return fword;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String word=sc.nextLine();
		System.out.println(removeConsecutiveDuplicates(word));
	}
}
