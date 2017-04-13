package Smthing.Day22;

import java.util.Scanner;

/**
 * Created by jiangning on 2017/3/22.
 */
public class Exerciseone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入消费金额");
        int amt = input.nextInt();
        System.out.println();
        System.out.println("是否参加优惠换购活动：");
        System.out.println("1：满50.。。。。");
        System.out.println("2：满100.。。。。");
        System.out.println("3：满100.。。。。");
        System.out.println("4：满200.。。。。");
        System.out.println("5：满200.。。。。");
        System.out.println("0：不换购");
        System.out.printf("请选择：");
        int str1 = input.nextInt();
        StringBuffer a = new StringBuffer("");
                switch (str1) {
                    case 1:
                        if (amt >= 50) {
                            a.append("本次消费总金额：")
                                    .append(Double.parseDouble(String.valueOf(amt + 2)))
                                    .append("\n").append("成功换购：百事可乐一瓶");
                            break;
                        } else {
                            a.append("本次消费总金额：")
                                    .append(Double.parseDouble(String.valueOf(amt)))
                                    .append("\n").append("换购失败");
                            break;
                        }
                    case 2:
                        if (amt >= 100) {
                            a.append("本次消费总金额：")
                                    .append(Double.parseDouble(String.valueOf(amt + 3)))
                                    .append("\n").append("成功换购：500ml可乐一瓶");
                            break;
                        } else {
                            a.append("本次消费总金额：")
                                    .append(Double.parseDouble(String.valueOf(amt)))
                                    .append("\n").append("换购失败");
                            break;
                        }
                    case 3:
                        if (amt >= 100) {
                            a.append("本次消费总金额：")
                                    .append(Double.parseDouble(String.valueOf(amt + 10)))
                                    .append("\n").append("成功换购：5公斤面粉");
                            break;
                        } else {
                            a.append("本次消费总金额：")
                                    .append(Double.parseDouble(String.valueOf(amt)))
                                    .append("\n").append("换购失败");
                            break;
                        }
                    case 4:
                        if (amt >= 200) {
                            a.append("本次消费总金额：")
                                    .append(Double.parseDouble(String.valueOf(amt + 10)))
                                    .append("\n").append("成功换购：1哥苏泊尔炒菜锅");
                            break;
                        } else {
                            a.append("本次消费总金额：")
                                    .append(Double.parseDouble(String.valueOf(amt)))
                                    .append("\n").append("换购失败");
                            break;
                        }
                    case 5:
                        if (amt >= 200) {
                            a.append("本次消费总金额：")
                                    .append(Double.parseDouble(String.valueOf(amt + 20)))
                                    .append("\n").append("成功换购：欧莱雅爽肤水一瓶");
                            break;
                        } else {
                            a.append("本次消费总金额：")
                                    .append(Double.parseDouble(String.valueOf(amt)))
                                    .append("\n").append("换购失败");
                            break;
                        }
                    case 0:
                        a.append("本次消费总金额：")
                                .append(Double.parseDouble(String.valueOf(amt)))
                                .append("\n").append("不换购");
                        break;
                    default:
                        a.append("本次消费总金额：")
                                .append(Double.parseDouble(String.valueOf(amt)))
                                .append("\n").append("请输入有效选项");
                }
                System.out.println(a.toString());
        }


    }
