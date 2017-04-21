package Smthing;

import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by jiangning on 2017/4/19.
 */
public class TuZi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入你要查次数");
        int s1,s2,f;
        s1 = 1;
        s2 = 1;
        f = in.nextInt();//

        if (s1 == 1 || s2 == 1) {
            System.out.println("第"+f + "的数为"+(s1+s2) );
        } else if (f == (s1 - 1) + (s2 - 2)) {
            System.out.println();
        } else {
            System.out.println();
        }
    }
}



        /*if (i == 1 || i == 2) {
            System.out.println("前两个数都为1");
        }else if (i>2){
            System.out.println(s=((i-1)+(i-2)));
        }else {
            System.out.println("输入错误");
        }*/

