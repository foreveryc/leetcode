package test;

public class test007 {
    public int strStr(String haystack, String needle) {
        char[] haystackchars=haystack.toCharArray();
        char[] needlechars=needle.toCharArray();
        for(int i=0;i<haystackchars.length;i++){
            if(haystackchars[i]==needlechars[i]){
                for(int j=1;j<needlechars.length;j++){
                    if(haystackchars[i+j]!=needlechars[i+j]){
                        break;
                    }
                }
                return i;
            }
        }
        return -1;
    }
}
