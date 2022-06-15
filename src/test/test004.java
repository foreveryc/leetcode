package test;

import java.util.*;

public class test004 {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int mid=0;
        char[] chars=s.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(map.containsKey(chars[i])){
               mid= map.get(chars[i]);
               mid++;
               map.put(chars[i],mid);
            }else {
                map.put(chars[i],1);
            }
        }
        for(int i=0;i<chars.length;i++){
            if(map.containsKey(chars[i])&&map.get(chars[i])==1) {
                return i;
            }
        }
        return -1;
    }
}
