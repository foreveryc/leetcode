package sout;

import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int total=sc.nextInt();
        int[] a=new int[total];
        for(int i=0;i<total;i++){
            a[i]=sc.nextInt();
        }
        int rs=0;
        for(int j=0;j<total;j++){
            rs=rs+coresolution(a[j]);
        }
        System.out.println(rs);
    }

    public static int coresolution(int t){
      if(t==1||t<1){
          return 0;
      }
      if(t==2){
          return 1;
      }
      if(t==3){
          return 1;
      }
      return coresolution(t-2)+coresolution(2);
    }
}
