package programs;

import java.util.*;
public class IsPermutation2 {

	public static boolean isPermutation(String str1, String str2) {
		List<String> l1=new ArrayList<String>();
        List<String> l2=new ArrayList<String>();
        if(str1.length()==str2.length()){
            for(int i=0;i<str1.length();i++){
                l1.add(String.valueOf(str1.charAt(i)));
                System.out.println(l1.get(i));
                l2.add(String.valueOf(str2.charAt(i)));
                System.out.println(l2.get(i));
            }
        }
        else    
            return false;
        Collections.sort(l1);
        System.out.println(l1);
        
        Collections.sort(l2);
        System.out.println(l2);
        int count=0;
        for(int i=0;i<str1.length();i++){
            if(l1.get(i).equals(l2.get(i)))
                	count++;
        }
	
    if(count==str1.length())
        	return true;
	else
        	return false;
    

}
	public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        if(isPermutation( str1,  str2)==true)
            	System.out.println(isPermutation( str1,  str2));
    	else
            System.out.println(isPermutation( str1,  str2));
    }
    }
