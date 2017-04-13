package Smthing.Day27;

import java.util.Scanner;

/**
 * Created by jiangning on 2017/3/27.
 */
public class Run {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("输入长跑圈数");
        int a=input.nextInt();
        for (int i=0;i<10;i++){


        }System.out.println("我跑的米数是："+a*400);
        if(a>=10){
            System.out.println("完成长跑任务");
        }else {
            System.out.println("快累死了，我要退出");
        }
    }
}
