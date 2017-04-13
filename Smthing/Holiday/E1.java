package Smthing.Holiday;

import java.util.Scanner;

/**
 * Created by jiangning on 2017/4/2.
 */
public class E1 {
    // 四位数 abcd=a*a*a+...
    public static void main(String[] args) {
//        for (int i=1000;i<10000;i++){
//            int a=i/1000;//千位数字
//            int b=i/100%10; // 百位数字
//            int c=i/10%10;
//            int d=i%10;
//            if (i==a*a*a*a+b*b*b*b+c*c*c*c+d*d*d*d){
//                System.out.println(i);
//            }
//        }
//
   //N位数 n=a的N次方+...
//        Scanner scanner=new Scanner(System.in);
//        int n = scanner.nextInt();
//        System.out.println("输入"+n);
        int n=1;
        int a=0 ;
        for (int i=0;i<=n;i++){
            n*=a;
        }
    }
}
