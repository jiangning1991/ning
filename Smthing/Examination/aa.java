package Examination;

import java.util.Scanner;

/**
 * Created by jiangning on 2017/3/27.
 */
public class aa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一位数");
        int a = input.nextInt();
        System.out.println("请输入最后一位是几位数");
        int b = input.nextInt();
        int i = 1;/*参数初始化*/
        int s = a;
        while (i < b) {
            a= (10 * a)+(a%10);
            System.out.println(a);
            s+=a;
            i++;
        }
        System.out.println(s);
    }
}


