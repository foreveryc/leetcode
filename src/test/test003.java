package test;

import java.math.BigDecimal;
import java.math.BigInteger;

public class test003 {
    public static int reverse(int x) {
        char[] chars=Integer.toString(x).toCharArray();
        if(chars[0]=='-'){
            chars=dfs(chars,1,chars.length-1);
        }else {
            chars=dfs(chars,0,chars.length-1);
        }

        StringBuffer s=new StringBuffer();
        for(int i=0;i<chars.length;i++){
            if(chars[0]=='-'&&i==1&&chars[i]==0){
                continue;
            }
            if (i==0&&chars[i]==0){
                continue;
            }
            s.append(chars[i]);
        }

        return Integer.parseInt(s.toString());
    }



    public static char[] dfs(char[] c,int strat,int end){
        char temp='0';
        while(strat<end){
            temp=c[strat];
            c[strat]=c[end];
            c[end]=temp;
            strat++;
            end--;
        }
        return c;
    }

    public static void main(String[] args) {
        int t=reverse(1534236469);
        System.out.println(t);


    }
}
