package sout;

import java.util.*;

public class soultion001 {
    public static void main(String[] args) {
        System.out.println(divingBoard(1,2,3));
    }

   public static int[] divingBoard(int a, int b, int k) {
       List<Integer> list=new ArrayList<>();
       Set<Integer> set=new HashSet<>();
       int mid=0;
       int count=0;
       for (int i=0;i<=k;i++){
           mid=a*i+b*(k-i);
           if(set.add(mid)){
               list.add(mid);
           }
       }
       if(list.size()==0){

       }

       int[] rs=new int[list.size()];
       for(int j=0;j<list.size();j++){
           rs[j]=list.get(j);
       }
       Arrays.sort(rs);
       return rs;
   }
}















