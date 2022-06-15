package sortList;

/*
* 插入排序:
* 原理：以第一个数自成数组a，从第二个数字开始，比较数组a中的最后一个数，如果此数大于数组a中的
* 最后一个数，则直接加入到数组的最后一个，如果此数小于数组a中的最后一个数，则比较倒数第二个数，
* 并将数组a中的最后一个数放置到此数的位置。
* */
public class sort002 {
    public static void insertSort(int[] arr){
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
}
