package xunfei_exam;

import java.util.Scanner;

public class solution2 {
    public static  int[] inputnums=new int[8];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<8;i++){
            inputnums[i]=sc.nextInt();
        }
        System.out.println(cheakContengle(inputnums));
    }

    public static int cheakContengle(int[] nums){
        int xstart=nums[0]<=nums[2]?nums[0]:nums[2];
        int xend=nums[0]>=nums[2]?nums[0]:nums[2];
        int ystart=nums[1]<=nums[3]?nums[1]:nums[3];
        int yend=nums[1]>=nums[3]?nums[1]:nums[3];
        int x2start=nums[4]<=nums[6]?nums[4]:nums[6];
        int x2end=nums[4]>=nums[6]?nums[4]:nums[6];
        int y2start=nums[5]<=nums[7]?nums[5]:nums[7];
        int y2end=nums[5]>=nums[7]?nums[5]:nums[7];

        if(x2start>xstart||x2end<xend||y2start<ystart||y2end>yend){
            return 1;
        }

        return 0;
    }
}
