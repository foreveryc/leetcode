package xunfei_exam;

import java.util.Scanner;

public class solution3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inputString=sc.next();
        char[] charset=inputString.toCharArray();
        StringBuffer result=new StringBuffer();
        for(int i=0;i<inputString.length();i++){
            if(charset[i]>'\060'&&charset[i]<'\071'){
                result.append(charset[i]);
            }
        }
        System.out.println(result);
    }
}
