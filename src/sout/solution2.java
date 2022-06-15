package sout;

import java.lang.reflect.Array;
import java.util.*;

public class solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int[] n=new int[T];
        int[][] a=new int[n.length][];
        for(int i=0;i<T;i++){
            n[i]=sc.nextInt();
            for (int j=0;j<n[i];j++){
                a[i][j]=sc.nextInt();
            }
        }
        List<Integer> integers=new ArrayList<>();
        int bigger=0;
        for(int i=0;i<T;i++){
            Arrays.sort(a[i]);
            for (int j=a[i].length-1;j>=0;j++){
                bigger=a[i][j];
                System.out.println(solve(bigger,0,j-1,a[i]));
            }

        }

    }

    public static boolean solve(int number,int start,int end,int[] nums){
        if(start>end){
            int mid =number-nums[end];
            if(mid==0){
                return true;
            }
            if(solve(mid,start,end-1,nums)==true){
                return true;
            }
        }
        return false;
    }

}
