package xunfei_exam;

import java.util.Scanner;

public class solution {
    public static int[] money={1, 5, 10, 50, 100};
    public static int[] result=new int[5];
    public static  int[] nums = new int[5];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            nums[i]=sc.nextInt();
        }
        int moneyall=sc.nextInt();
        int m = 4;

        if (matchCore(m, moneyall) == false) {
            System.out.println("-1");
        }else{
            System.out.println(result[0]+result[1]+result[2]+result[3]+result[4]);
        }
//        if (moneyall > 100) {
//            m = 4;
//            if (matchCore(4, moneyall) == false) {
//                System.out.println("-1");
//            }else{
//                System.out.println(result[0]+result[1]+result[2]+result[3]+result[4]);
//            }
//        }
//
//        if (moneyall >= 50 && moneyall < 100) {
//            m = 3;
//            if (matchCore(3, moneyall) == false) {
//                System.out.println("-1");
//            }else{
//                System.out.println(result[0]+result[1]+result[2]+result[3]+result[4]);
//            }
//        }
//
//        if (moneyall >= 10 && moneyall < 50) {
//            m = 2;
//            if (matchCore(2, moneyall) == false) {
//                System.out.println("-1");
//            }else{
//                System.out.println(result[0]+result[1]+result[2]+result[3]+result[4]);
//            }
//        }
//
//        if (moneyall >= 5 && moneyall < 10) {
//            m = 1;
//            if (matchCore(1, moneyall) == false) {
//                System.out.println("-1");
//            }else{
//                System.out.println(result[0]+result[1]+result[2]+result[3]+result[4]);
//            }
//        }
//
//        if (moneyall > 1) {
//            m = 0;
//            if (matchCore(0, moneyall) == false) {
//                System.out.println("-1");
//            }else{
//                System.out.println(result[0]+result[1]+result[2]+result[3]+result[4]);
//            }
//        }

        return;
    }

    static boolean matchCore(int m, int lastmoney) {
        int sum = lastmoney / money[m];
        int last = lastmoney % money[m];
        while (sum > nums[m]) {
            sum--;
            last = last + money[m];
        }
        result[m] = sum;
        m--;
        if (m >= 0 && lastmoney > 0) {
            matchCore(m, lastmoney);
        }
        if (m < 0 && lastmoney > 0) {
            return false;
        }
        return true;
    }
}