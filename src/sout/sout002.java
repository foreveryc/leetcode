package sout;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sout002 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        List<Integer> rs=new ArrayList<>();
        int n=scanner.nextInt();
        int num=scanner.nextInt();
        for(int i=0;i<n;i++){
            list.add(scanner.nextInt()+scanner.nextInt()*2);
        }
        rs=cheackmax(list,num);
        for(int j=0;j<rs.size();j++){
            if(j==rs.size()-1){
                System.out.println(rs.get(j));
            }else{
                System.out.println(rs.get(j)+" ");
            }
        }
    }

    public static List cheackmax(List<Integer> list,int n){
        if(list.size()==0){
            return null;
        }

        int max=0;
        int maxnum=(int)list.get(0);
        List<Integer> rs=new ArrayList<>();
        for (int x=0;x<n;x++){
            for(int i=0;i<list.size();i++){
                if(list.get(i)>maxnum){
                    maxnum=list.get(i);
                    max=i;
                }
            }
            list.add(max,-1);
            rs.add(max+1);
            max=0;
            maxnum=-1;
        }

        return rs;

    }
}
