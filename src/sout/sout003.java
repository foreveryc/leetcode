package sout;

import java.util.Scanner;

public class sout003 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            String s=scanner.next();
            if(dfs(s)){
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean dfs(String s){
        if(s==null||s==""||s.length()>10){
            return false;
        }
        char[] chars=s.toCharArray();
        for(int i=0;i<chars.length;i++){
            if((chars[i]>=97&&chars[i]<=122)||(chars[i]>=48&&chars[i]<=57)||(chars[i]>=65&&chars[i]<=90)){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
