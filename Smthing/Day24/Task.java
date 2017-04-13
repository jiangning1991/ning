package Smthing.Day24;

import java.util.Scanner;

/**
 * Created by jiangning on 2017/3/24.
 */
public class Task {
    public static void main(String[] args) {
        boolean flag = true;
        do{
            System.out.println("上机编程\n是否完成任务n/y");
            Scanner sc = new Scanner(System.in);
            char ch = sc.next().charAt(0);
            if(ch=='y'){
                flag=false;
            }else {
                flag=true;
            }
        }while (flag);
        System.out.println("恭喜完成任务");
    }
}
