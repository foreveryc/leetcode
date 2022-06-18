package leetcode_everyTest2022;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 给定一个整数数组和一个整数 k，你需要在数组里找到 不同的 k-diff 数对，并返回不同的 k-diff 数对 的数目。
 * 这里将 k-diff 数对定义为一个整数对 (nums[i], nums[j])，并满足下述全部条件：
 *
 * 0 <= i < j < nums.length
 * |nums[i] - nums[j]| == k
 */

public class lc20220616 {

    public static int findPairs(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        Set<Integer> s=new HashSet<>();
        int rscount=0;
        int min=0;
       for(int i=0;i<nums.length;i++){
           for (int j=0;j<nums.length;j++){
               if (i==j){
                   continue;
               }

               if(nums[i]-nums[j]==k||Math.abs(nums[i]-nums[j])==k){
                   min=nums[i]<nums[j]?nums[i]:nums[j];
                   if(s.contains(min)){
                       continue;
                   }

                   rscount++;
                   s.add(min);

               }
           }
       }
       return rscount;

    }

    public static void main(String[] args) {
        int[] a= {1,3,1,5,4};
        int t=findPairs(a,0);
        System.out.println(t);
    }
}
