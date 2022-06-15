package com;

import java.util.*;

public class Test7 {
    public static void main(String[] args) {
//        int[] acm = {0, 0, 0, 1, 1, 1, 2, 2, 2};
        int[] acm = {1,2,4,2,4,3,3,1};
        boolean end = play(acm);
        System.out.println(end);
    }

    public static boolean play(int[] deck) {
        int min=0;
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < deck.length; i++) {
            if (map.containsKey(deck[i])) {
                count = map.get(deck[i]);
                map.put(deck[i], ++count);
            } else {
                map.put(deck[i], 1);
            }
        }
//       if(map.isEmpty()){
//           return true;
//       }else{
//           return false;
//       }
        for (Integer num : map.values()) {
            list.add(num);
        }
//        if(list.size()==1&&list.get(0)==1){
//            return false;
//        }

        Collections.sort(list);
        min=list.get(0);
        if(min<2){
            return false;
        }

        for(int i=0;i<list.size();i++){
            if(list.get(i)%min==0){
                continue;
            }else{
                return false;
            }
        }
        return  true;

    }
}
