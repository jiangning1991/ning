package Smthing.Day28;

import java.util.Scanner;

/**
 * Created by jiangning on 2017/3/27.
 */
public class Nood {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入1班4位同学的成绩：");
        double a = 0;
        for (int i = 1; i < 5; i++) {
            System.out.println("第" + i + "位学院的成绩为");
            double b = input.nextInt();
            a = b + a;
        }
        System.out.println("1班4位同学的平均分是" + a / 4 + "分");
    }


}
