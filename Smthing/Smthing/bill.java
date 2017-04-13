package Smthing.Smthing;

import java.util.Scanner;

/**
 * Created by jiangning on 2017/3/15.
 */
public class bill {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Double a;
        Double b;
        Double c;
        System.out.println("输入分钟数");
        Double x=input.nextDouble();
        if (x<100){
            c=(x*0.75);
            b=50.0;
            a=50.0;
        }

        else if (300>=x&x>100){
            a=50+x-100;
            b=(x-100)*0.85+50;
            c=x*0.75;

        }
        else {
            a=(x-100)+50;
            b=(x-100)*0.85+50;
            c=0.75*x;
        }

        if(a<=b&&a<=c){
            System.out.println("选择套餐1或者套餐2");
        }
        else if (b<c){
            System.out.println("选择套餐2");
        }
        else {
            System.out.println("选择套餐3");
        }

        }

}
