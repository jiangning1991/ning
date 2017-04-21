package Smthing;

import java.util.Scanner;

/**
 * Created by jiangning on 2017/4/20.
 */
public class Soo {
    public static void main(String[] args) throws Exception
    {
        int y,m,d;
        int sum=0;
        int feb=28;
        Scanner in = new Scanner(System.in);
        System.out.print("请输入年份:");
        y = in.nextInt();
        System.out.print("请输入月份:");
        m = in.nextInt();
        System.out.print("请输入几号:");
        d = in.nextInt();

        if((y%4==0 && y%100!=0) || y%400==0)
        {
            feb = 29;
        }

        switch(m)
        {
            case 1:
                sum = d;
                break;
            case 2:
                sum = 31 + d;
                break;
            case 3:
                sum = 31+feb+d;
                break;
            case 4:
                sum = 31+feb+31+d;
                break;
            case 5:
                sum = 31+feb+31+30+d;
                break;
            case 6:
                sum = 31+feb+31+30+31+d;
                break;
            case 7:
                sum = 31+feb+31+30+31+30+d;
                break;
            case 8:
                sum = 31+feb+31+30+31+30+31+d;
                break;
            case 9:
                sum = 31+feb+31+30+31+30+31+31+d;
                break;
            case 10:
                sum = 31+feb+31+30+31+30+31+31+30+d;
                break;
            case 11:
                sum = 31+feb+31+30+31+30+31+31+30+31+d;
                break;
            case 12:
                sum = 31+feb+31+30+31+30+31+31+30+31+30+d;
        }
        System.out.println(y+" 年 "+m+" 月 " + d + "号是今年的第"+sum+"天");
    }
}

