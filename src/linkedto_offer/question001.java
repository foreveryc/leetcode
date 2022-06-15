package linkedto_offer;

/*
 * 正则表达式匹配
 * 原理：
 * */
public class question001 {
    public static boolean match(String str,String pattern){
        if(str==null||pattern==null){
            return false;
        }

        return matchCore(str,pattern);
    }

    public static boolean matchCore(String str,String pattern){
        if(str==""&&pattern==""){
            return true;
        }

        if(str!=""&&pattern==""){
            return false;
        }

        return false;

    }
}
