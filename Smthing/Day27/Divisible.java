package Smthing.Day27;

import java.util.Scanner;

/**
 * Created by jiangning on 2017/3/27.
 */
public class Divisible {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double b=0;
        double c=0;
        /*int a = input.nextInt();*/
        for (int i=1;i<=10;i++){
            System.out.println("请输入第"+i+"位顾客的年龄");
            int a=input.nextInt();
            if(a<=30){
                b++;
            }else {
                c++;
            }

        }
        System.out.println("30岁以下的比例是："+b/10*100+"%");
        System.out.println("30岁以上的比例是："+c/10*100+"%");

    }
}
