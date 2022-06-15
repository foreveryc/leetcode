package com;

public class Test5 {
    public static void main(String[] args) {
        int[][] acm= {{}};
        int end=play(acm);
        System.out.println(end);
    }

    public static int play(int[][] acm) {
        int result=0;
        for(int i=0;i<acm.length;i++) {
            for(int j=0;j<acm[i].length;j++) {
                if(acm[i][j]!=0) {
                    result+=(4*acm[i][j]+2);
                }
                if(j-1>=0) {
                    result-=2*((acm[i][j]-acm[i][j-1]>=0?acm[i][j-1]:acm[i][j]));
                }
                if(i-1>=0) {
                    result-=2*((acm[i][j]-acm[i-1][j]>=0?acm[i-1][j]:acm[i][j]));
                }
            }
        }
        return result;
    }
}
