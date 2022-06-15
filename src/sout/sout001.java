package sout;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class sout001 {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i=0;i<n;i++){
            list.add(dfs2(scanner.next()));
        }

    }

    public static boolean dfs(String s){
        if(s==null&&s==""){
            return false;
        }
        int num1=0;
        int num2=0;
        char[] chars=s.toCharArray();
        for (int i=0;i<chars.length;i++) {
            if(i==0&&((s.charAt(i)>=65&&s.charAt(i)<=90)||(s.charAt(i)>=97&&s.charAt(i)<=112))){
                num1++;
            }else {
                return false;
            }

            if((s.charAt(i)>=65&&s.charAt(i)<=90)||(s.charAt(i)>=97&&s.charAt(i)<=112)){
                num1++;
            }else if((s.charAt(i)>=48&&s.charAt(i)<=57)){
                num2++;
            }else{
                return false;
            }
        }
        if (num1>0&&num2>0){
            return true;
        }
        return false;
    }

    public static String dfs2(String s) {
        String str="^[A-Z a-z 0-9]+$";
        if(!Pattern.compile(str).matcher(s).find()){
            return "Wrong";
        }
        String rg="^[A-Z a-z]+[1-9]+[a-z A-Z]*[1-9]*";
        Pattern p=Pattern.compile(rg);
        if(p.matcher(s).find()){
            return "Accept";
        }
        return "Wrong";
    }
}
