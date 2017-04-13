package Smthing.Day24;

import java.util.Scanner;

/**
 * Created by jiangning on 2017/3/24.
 */
public class Deposit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("输入存款金额");
        double x = input.nextDouble();
        for(double y=0;y<5;y++){
            x=x*(0.003+1);

        }
        System.out.println(x);
    }
}
