package com;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test9 {
    public static int maxSubArray(int[] nums) {
        int llength=nums.length;
        if(llength==0){
            return 0;
        }else{
            for(int i=1;i<llength;i++){
                if(nums[i-1]>0){
                    nums[i]=nums[i-1]+nums[i];
                }
            }
        }
        Arrays.sort(nums);
        return nums[llength-1];
    }

    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        int rs=maxSubArray(nums);
        System.out.println(rs);
    }
}
