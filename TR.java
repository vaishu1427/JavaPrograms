package programs;
import java.util.Scanner;
public class TR {
		public static String reverseWordWise(String input) {
			int index=0;
			 String f="";
			 for(int i=0;i<input.length();i++){
				 if(input.charAt(i)==' ' || i==input.length()-1){
					 index=i;
					 if(input.charAt(i)!=' '){
	                 index++;
	             }
	 
				 for(int j=index-1;j>=0 && input.charAt(j)!=' ';j--){
					 f=f+input.charAt(j);
	 
	             }
				 if(input.charAt(i)==' ')
		                f=f+' ';
				 }
		      }
		      return f;// Write your code here

		}
	    public static void main(String[] args){
	 	Scanner sc=new Scanner(System.in);
	    String st=sc.nextLine();
	 
	    System.out.println(reverseWordWise(st));
	}
	 
	}
