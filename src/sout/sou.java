package sout;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sou {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        List<Integer> list=new ArrayList<>();
        list=addlist(list,n);
    }

    public static List addlist(List list,int n){
        int a=1;
        int b=1;
        int mid;
        int num;
        if(n>1){
            list.add(1);
            list.add(1);
        }
        for(int i=0;i<n;i++){
            num=a+b;
            list.add(num);
            mid=b;
            b=num;
            a=b;
        }
        return list;
    }
}
