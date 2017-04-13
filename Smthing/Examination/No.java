package Examination;

import java.util.Scanner;

/**
 * Created by jiangning on 2017/3/25.
 */
public class No {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("循环数为");
        int a = input.nextInt();//定义起始数
        System.out.println("循环加多少次");
        int b = input.nextInt();//定义循环次数
        int c = 0; // 每次生成的新数
        int d = 0; // 计算结果
        for (int i = 0; i < b; i++) {
            c = c * 10 + a;
            System.out.println(c);
            d = d + c;

        }System.out.println("计算结果:" + d);
    }
}
