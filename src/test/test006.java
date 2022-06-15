package test;

import java.util.Stack;

public class test006 {
    public static boolean isPalindrome(String s) {
        char[] c=s.toCharArray();
        Stack<Character> stack=new Stack<>();

        char down=' ';
        for(int i=c.length-1;i>=0;i--){
            if(c[i]>='a'&&c[i]<='z'){
                stack.push(c[i]);
            }
        }
        for(int j=c.length-1;j>=0;j--){
            if(c[j]>='a'&&c[j]<='z'){
               if(c[j]!=stack.pop()||c[j]+26!=stack.pop()+0||c[j]-26!=stack.pop()+0){
                   return false;
               }
            }
        }

        return  true;
    }

    public static void main(String[] args) {
        boolean b=isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(b);
    }
}
