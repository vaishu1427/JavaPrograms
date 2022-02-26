package programs;

//It will print all the substrings of a word.


import java.util.Scanner;
public class SubstringsOfAword {

	public static void printSubstrings(String str) {
		for(int i=0;i<str.length();i++){
		    for(int j=i+1;j<=str.length();j++){
		        System.out.println(str.substring(i,j));
		    }
		}
	}
	public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
	    String s=sc.next();
	    printSubstrings(s);
	}

}
