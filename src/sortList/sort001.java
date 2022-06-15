package sortList;

/*
* 选择排序:
* 原理：每次遍历一次数组，把最小的放到最前面
* */
public class sort001 {
    public static void selectSort(int[] a){
        int temp=0;
        int flag=0;
        int n=a.length;
        for (int i=0;i<n;i++){
            temp=a[i];
            flag=i;
            for (int j=i+1;j<n;j++){
                if(a[j]<temp){
                    temp=a[j];
                    flag=j;
                }
            }
            if(flag!=i){
                a[flag]=a[i];
                a[i]=temp;
            }
            foreachNums(a);
        }

    }

    public static void main(String[] args) {
        int[] nums={24,84,21,47,15,27,68,35,20};
        selectSort(nums);
        System.out.println(nums.toString());
    }

    public static void foreachNums(int[] nums){
        StringBuffer result=new StringBuffer();
        for (int i=0;i<nums.length;i++){
            result.append(nums[i]);
            result.append(" ");
        }
        System.out.println(result);
    }
}
