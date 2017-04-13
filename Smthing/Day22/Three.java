package Smthing.Day22;

import java.util.Scanner;

/**
 * Created by jiangning on 2017/3/22.
 */
public class Three {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入你要查的月份");
        int s1, s2, f;
        s1 = 1;//一月
        s2 = 1;//二月
        /*int n;//第N个月
        f = in.nextInt();//兔子
        while (true) {
            if (s1 == 1 || s2 == 1) {
                System.out.println(f + "n" + s1);
                f++;
            } else if (f == (s1 - 1) + (s2 - 2)) {
                System.out.println();
                f++;
            } else {
                System.out.println();
                break;*/
        int i = 1;
        int m;//月份
        m = in.nextInt();
        while(i>=1) {
            if(i==1||i==2){
                System.out.println(i+"月"+s1);
                i++;
            }else if(i==(s1-1)+(s2-2)){
                s1 = s1+s2;
                s2 = s1+s2;
                System.out.println(i+"月"+s1);
                i++;
                System.out.println(i+"月"+s2);
                i++;

            }else {
                System.out.println();
                break;

            }


            }
        }
}