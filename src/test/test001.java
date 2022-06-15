package test;

public class test001 {
    /*
    快速排序
     */
    public static void sorttest(int[] num,int start, int end) {
        if(start<end){
            int temp=num[start];
            int i=start;
            int j=end;
            while(i<j){
                while(i<j&&num[j]>temp){
                    j--;
                }

                num[i]=num[j];

                while (i<j&&num[i]<=temp){
                    i++;
                }

                num[j]=num[i];
            }

            num[i]=temp;
            foreachNums(num);
            sorttest(num,start,i-1);
            sorttest(num,i+1,end);
        }else
            return;


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
        int[] nums={24,84,21,47,15,27,68,35,20};
        sorttest(nums,0,nums.length-1);
        System.out.println(nums.toString());
    }
}
