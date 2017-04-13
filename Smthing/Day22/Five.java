package Smthing.Day22;

import java.util.Scanner;

/**
 * Created by jiangning on 2017/3/22.
 */
public class Five {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        double a;
//        double b;
//        double c;
        System.out.println("输入成绩");
        int x =input.nextInt();
        if (x >= 90) {
            System.out.println("A");
        } else if (x > 90 && x >= 60) {
            System.out.println("B");
        }else {
            System.out.println("C");
        }


    }}

