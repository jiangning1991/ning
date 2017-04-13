package Smthing.Smthing;

import java.util.Scanner;

/**
 * Created by jiangning on 2017/3/15.
 */
public class equation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Double a=input.nextDouble();
        System.out.println("输入a");
        Double b=input.nextDouble();
        System.out.println("输入b");
        Double c=input.nextDouble();
        System.out.println("输入c");
        if ((a+b)>c&&(a-b)<c){
            Double p=(a+b+c)/2;
            Double area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("面积为"+area);
        }else {
            System.out.println("不成立");}
    }

}
