package Smthing.Day27;

import java.util.Scanner;

/**
 * Created by jiangning on 2017/3/27.
 */
public class Addition {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个值：");
        int a=input.nextInt();

        for (int i=0 ,b=a;i<a;i++,b--){

            System.out.println(i +  " + " + b+"="+(i+b));
        } System.out.println("根据这个值可以输出以下加法表");


    }
    }

