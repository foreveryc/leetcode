package test;

/**
 * A-Z   65-90
 * a-z   97-112
 * 1-10   49-58
 * break 只跳出一层循环
 */

public class test008 {
    public static void main(String[] args) {
//        for(int i=0;i<100;i++){
//            char s=(char)(i);
//            System.out.println(s);
//        }
        for(int i=90;i<114;i++){
            char s=(char)(i);
            if(s>=97&&s<112){
                 for(int j=1;j<10;j++){
                     char t=(char)(i+j);
                     if(t=='c'||t=='q'){
                         break;
                     }
                     System.out.println("3---"+t);
                 }
                System.out.println("2---"+s);
            }
            System.out.println("1---"+s);
        }


    }

}
