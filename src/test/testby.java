package test;

import java.util.HashMap;
import java.util.Map;

public class testby {
        public static int[] plusOne(int[] digits) {
            int[] result=dfs(digits,digits.length-1,true);
            return result;
        }

        public static int[] dfs(int[] nums,int i,boolean up){
            if(i<0){
                if(up==true){
                    int[] numsnew=new int[nums.length+1];
                    for(int j=0;j<nums.length;j++){
                        numsnew[j+1]=nums[j];
                    }
                    numsnew[0]=1;
                    return numsnew;
                }
                return nums;
            }
            if(up==true){
                if(nums[i]+1==10){
                    nums[i]=0;
                    nums=dfs(nums,i-1,true);
                }else {
                    nums[i]=nums[i]+1;
                    nums=dfs(nums,i-1,false);
                }
            }
            return nums;

        }

    public static void foreachNums(int[] nums){
        StringBuffer result=new StringBuffer();
        for (int i=0;i<nums.length;i++){
            result.append(nums[i]);

            result.append(" ");
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] testnums={9};
        int[] rs=plusOne(testnums);
        foreachNums(rs);

    }

}
