package leetcode_everyTest2022;

/**
 * 给你一个长度固定的整数数组arr，请你将该数组中出现的每个零都复写一遍，并将其余的元素向右平移。
 * 注意：请不要在超过该数组长度的位置写入元素。
 * 要求：请对输入的数组就地进行上述修改，不要从函数返回任何东西。
 */

public class lc20220617 {
    public static void duplicateZeros(int[] arr) {
        int zeroCount=0;
        for (int i=0;i<arr.length;i++){
            if(i<arr.length-1-zeroCount){
                if(arr[i]==0){
                    zeroCount++;
                }
            }
        }

        int now=0;
        for (int j=0;j<arr.length;j++){
            if(arr[j]==0){
                if(j+2<arr.length){
                    for (int k=j+2;k<arr.length;k++){
                        now=arr[k];
                        arr[k]=arr[j+1];
                        arr[j+1]=now;
                    }
                    arr[j+1]=0;
                    j++;
                }else if (j+1<arr.length){
                    arr[j+1]=0;
                }

            }
        }
    }

    public static void main(String[] args) {
        int[] nums={1,0,2,3,0,4,0,5,6,7};
        duplicateZeros(nums);
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }

    }
}
