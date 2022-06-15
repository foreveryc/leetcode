package sout;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class sout004 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int pn=scanner.nextInt();
        int times=scanner.nextInt();
        List<Integer> list=new ArrayList<>();
        for (int i=0;i<2;i++){
           int dd=scanner.nextInt();
            list.add(dd);
        }
        List<Integer> inter=new ArrayList<>();
        for(int j=0;j<pn;j++){
            inter.add(j,j+1);
        }
        for(Integer t:list){
            if(t==1){
                inter=test1(inter);
            }
            if(t==2){
                inter=test2(inter);
            }
        }

        for(int i=0;i<inter.size();i++){
            if(i==inter.size()-1){
                System.out.print(inter.get(i));
            }else{
                System.out.print(inter.get(i)+" ");
            }
        }
    }

    public static List<Integer> test1(List<Integer> nums){
        int mid= nums.get(0);
        nums.remove(0);
        nums.add(mid);
        return nums;
    }

    public static List<Integer> test2(List<Integer> nums){
        int mid;
        for(int i=0;i<nums.size();i=i+2){
            mid=nums.get(i+1);
            nums.add(i+1,nums.get(i));
            nums.add(i,mid);
        }
        return nums;

    }
}
