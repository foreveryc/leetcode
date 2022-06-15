package com;

import java.util.Stack;

public class Test3 {
    public static void main(String[] args) {
        int n = 10;
        int[] it = tx(n);
        System.out.println(it);
    }

    public static int[] tx(int n) {
        int[] ints = new int[n];
        for(int i=0;i<ints.length;i++){
            ints[i]=0;
        }
        for(int i=ints.length-1;i>=0;i--){
            System.out.println();
            ints[i]++;
            if(ints[i]==10){



                System.out.println();

                if(i!=ints.length-1){
                    i=ints.length;
                    continue;
                }
                i++;
                continue;
            }
            if(i-1>0){
                ints[i]=0;
            }



        }
        return null;
    }

}
