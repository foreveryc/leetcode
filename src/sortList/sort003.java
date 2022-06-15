package sortList;

/*
* 冒泡排序:
* 原理：从数组前端开始，两两比较，将大的数字放在后面一个。第一个循环是指有多少个最后一个已经安排好了
* 第二个循环则是两两比较，把大的放后面一个，，第二次循环的长度是arr.length - 第一次循此数 -1
* 表示的是第二次循环的此数将减去第一次已经排完的最大数字的次数
* */
public class sort003 {
    public static void insertSort(int[] arr){
        if(arr==null || arr.length < 2 ){
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i -1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
