package test;

import java.util.HashMap;
import java.util.Map;

public class test005 {
    public static boolean isAnagram(String s, String t) {
        Map<Character,Integer> map=new HashMap<>();
        char[] chars=s.toCharArray();
        char[] chars2=t.toCharArray();
        int mid=0;
        for(int i=0;i<chars.length;i++){
            if(map.containsKey(chars[i])){
                mid=map.get(chars[i]);
                mid++;
                map.put(chars[i],mid);
            }else{
                map.put(chars[i],1);
            }
        }

        for(int j=0;j<chars2.length;j++){
            if(map.containsKey(chars2[j])){
                mid=map.get(chars2[j]);
                mid--;
                if(mid<0){
                    return false;
                }
                map.put(chars2[j],mid);
            }else{
                return false;
            }
        }

        for(Character c:map.keySet()){
            if(map.get(c)!=0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        boolean b=isAnagram("a","b");
        System.out.println(b);
    }
}
