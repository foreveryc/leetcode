package Leetcode_everydayTest;

public class Test005 {
    public static void main(String[] args) {

    }

    public int countBinarySubstrings(String s) {
        char[] chars=s.toCharArray();
        int flag;
        int last=0;
        int count=0;
        int rs=0;
        if(chars.length==0||s==""){
            return 0;
        }else{
            flag=chars[0]==1?1:0;
        }
        for(int i=0;i<s.length();i++){
            if(chars[i]==flag){
                count++;
                continue;
            }
            rs=rs+Math.min(count,last);
            last=count;
        }
        return rs;
    }
}

/**
 * 题解：
 *  int ptr = 0, n = s.size(), last = 0, ans = 0;
 *         while (ptr < n) {
 *             char c = s[ptr];
 *             int count = 0;
 *             while (ptr < n && s[ptr] == c) {
 *                 ++ptr;
 *                 ++count;
 *             }
 *             ans += min(count, last);
 *             last = count;
 *         }
 *         return ans;
 *
 */
