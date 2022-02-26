package programs;
import java.util.*;
class MaventicQuestion1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num[] = sc.next().split("");
        int max = 0;
        for(int i = 0; i < num.length-2; i++) {
            int curNum = Integer.parseInt(num[i]+num[i+1]+num[i+2]);
            if(curNum > max){
                max = curNum;
            }
        }
        System.out.println(max);
    }
}
