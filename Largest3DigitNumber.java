package programs;
import java.util.*;
public class Largest3DigitNumber {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String num[] = sc.next().split("");
	        int max = 0;
	        for(int i = 0; i < num.length-1; i=i+2) {
	            int curNum = Integer.parseInt(num[i]+num[i+1]);
	            if(curNum > max && curNum%11!=0){
	                max = curNum;
	            }
	        }
	        System.out.println(max);
	    }
}