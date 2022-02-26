package programs;

import java.util.Scanner;
public class IsPermutation1 {

	public static boolean isPermutation(String str1, String str2) {
        boolean flag=false;
        int count=0;
		for(int i=0;i<str2.length();i++){
            for(int j=0;j<str1.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    str2=str2.substring(0,j)+'0'+str2.substring(j+1);
                    //System.out.println(str2);
                    count++;
                }
            }
        }
        if(count==str1.length()){
            flag=true;
        }
        else{
            flag=false;
        }
        return flag;
	}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String st1=sc.nextLine();
        String st2=sc.nextLine();
        //StringBuilder sb=new StringBuilder(st1,st2);
        System.out.println(isPermutation(st1,st2));
    }

}