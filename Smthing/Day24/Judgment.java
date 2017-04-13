package Smthing.Day24;

import java.util.Scanner;

/**
 * Created by jiangning on 2017/3/24.
 */
public class Judgment {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入数字");

        int sum=input.nextInt();
        int result=0;
        while (sum>0)
        {
            ++result;
            sum/=10;
        }
        System.out.println("你输入的整数是"+result+"位数");

    }
}
