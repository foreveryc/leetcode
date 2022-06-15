package com;

import sun.rmi.transport.proxy.RMIMasterSocketFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test8 {
    List<Integer> list=new ArrayList<>();
    public static int maxProfit(int[] prices){

        int llength=prices.length;
        int sum=0;
        int zaxm=0;
        int minm=0;
        if(llength==0){
            return 0;
        }else{
            minm=prices[0];
            zaxm=prices[0];
            for(int i=0;i<llength;i++){
               if(prices[i]>=zaxm){
                  zaxm=prices[i];
               }else{
                   sum=zaxm-minm+sum;
                   minm=prices[i];
                   zaxm=prices[i];
               }

            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] rs={7,1,5,3,6,4 };
        int t=maxProfit(rs);
        System.out.println(t);
    }
}
