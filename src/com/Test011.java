package com;

public class Test011 {
    public static int maxEnvelopes(int[][] envelopes) {
        if (envelopes==null&&envelopes.length==0){
            return 0;
        }
        int resultcount=1;
        int maxnow[][]={{0,0}};
        int newnums[][]={};
        for (int i=0;i<envelopes.length;i++){

        }
        return 0;
    }

    public static void main(String[] args) {
        int envelopes[][] = {{5,4},{6,4},{6,7},{2,3}};
        int rs = maxEnvelopes(envelopes);
        System.out.println(rs);
    }
}
