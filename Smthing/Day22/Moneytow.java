package Smthing.Day22;

import java.util.Scanner;

/**
 * Created by jiangning on 2017/3/23.
 */
public class Moneytow {
    public static void main(String[] args) {
        System.out.println("**********************************\n" +
                "请选择购买的商品编号：\n" +
                "1.T恤   2.网球鞋  3.网球拍\n" +
                "***************************************"
        );
        Scanner sc = new Scanner(System.in);
        char flag = 'y';
        double sum = 0;
        while (flag == 'y') {
            System.out.println("请输入商品编号：");
            int id = sc.nextInt();//商品编号
            System.out.print("请输入商品数量：");
            int num = sc.nextInt();//商品数量

            //根据商品编号和数量进行输出
            switch (id) {
                case 1:
                    sum += num * 245.0;
                    System.out.println("T恤 245.0" + num + "合计：" + num * 245.0);
                    break;
                case 2:
                    sum += num * 570.0;
                    System.out.println("网球鞋 570.0" + num + "合计：" + num * 570.0);
                    break;
                case 3:
                    sum += num * 1000.0;
                    System.out.println("网球拍 1000.0" + num + "合计：" + num * 1000.0);
                    break;

            }
            //是否继续 y/n
            System.out.println("是否继续");
            flag = sc.next().charAt(0);
            if (flag == 'n') {
                System.out.println("折扣0.8\n 应付金额：" + sum * 0.8);
            }
        }

    }}
