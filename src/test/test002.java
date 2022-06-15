package test;

public class test002 {
    public static void Quicksort(int[] arr,int start,int end){
        if(start<end){
            int i=start;
            int j=end;
            int temp=arr[start];
            while(i<j){
                while (i<j&&arr[end]>temp)
                    j--;
                arr[start]=arr[end];
                while(i<j&&arr[start]<temp)
                    i++;
                arr[end]=arr[start];
            }

            arr[i]=temp;

            Quicksort(arr,start,i-1);
            Quicksort(arr,i+1,end);
        }
    }
}
