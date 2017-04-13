package Smthing.Day27;

import java.util.Scanner;

/**
 * Created by jiangning on 2017/3/27.
 */
public class Average {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("输入学生名字");
        double a=0;
        for (int i=1;i<6;i++){
            System.out.println("第"+i+"门课程的成绩是： ");
            int c=input.nextInt();
            a+=c;

        }
        System.out.println("平均分为"+(a/5));
    }
}
